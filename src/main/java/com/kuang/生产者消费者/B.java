package com.kuang.生产者消费者;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class B {
    public static void main(String[] args) {
        Thing2 th=new Thing2();

        new Thread(()->{
            for(int i=0;i<100;i++) {
                try {
                    th.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(()->{
            for(int i=0;i<100;i++) {
                try {
                    th.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();

        new Thread(()->{
            for(int i=0;i<100;i++) {
                try {
                    th.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();

        new Thread(()->{
            for(int i=0;i<100;i++) {
                try {
                    th.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"D").start();
    }
}



class Thing2{
    Lock lock=new ReentrantLock();
    Condition condition=lock.newCondition();
    public int num=0;

    public void increment() throws InterruptedException {
    lock.lock();
    while(num!=0){
        condition.await();
    }
        num++;
        System.out.println(Thread.currentThread().getName()+"---->num的值变成:"+num);
        condition.signalAll();
        lock.unlock();
    }


    public void decrement() throws InterruptedException {
        lock.lock();
        while(num==0){
            condition.await();
        }
        num--;
        System.out.println(Thread.currentThread().getName()+"---->num的值变成:"+num);
        condition.signalAll();
        lock.unlock();
    }
}