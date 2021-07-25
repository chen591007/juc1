package com.kuang.生产者消费者;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class C {

    public static void main(String[] args) {
        Printsb sb=new Printsb();

        new Thread(()->{
            for(int i=0;i<10;i++){
                try {
                    sb.printA();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        },"A").start();
        new Thread(()->{
            for(int i=0;i<10;i++){
                try {
                    sb.printB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        },"B").start();
        new Thread(()->{
            for(int i=0;i<10;i++){
                try {
                    sb.printC();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        },"C").start();
    }
}




/*
 * 实现精确唤醒
 * */

class Printsb{
    Lock lock=new ReentrantLock();
    Condition condition1=lock.newCondition();
    Condition condition2=lock.newCondition();
    Condition condition3=lock.newCondition();
    public int num=1;

    public void printA() throws InterruptedException {
        lock.lock();
        if(num!=1){
            condition1.await();
        }
        num=2;
        System.out.println(Thread.currentThread().getName()+"------>"+"AAAAAAA");
        condition2.signal();
        lock.unlock();
    }

    public void printB() throws InterruptedException {
        lock.lock();
        if(num!=2){
            condition2.await();
        }
        num=3;
        System.out.println(Thread.currentThread().getName()+"------>"+"BBBBBBB");
        condition3.signal();
        lock.unlock();
    }



    public void printC() throws InterruptedException {
        lock.lock();
        if(num!=3){
            condition3.await();
        }
        num=1;
        System.out.println(Thread.currentThread().getName()+"------>"+"CCCCCCCC");
        condition1.signal();
        lock.unlock();
    }


}

