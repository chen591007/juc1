package com.kuang.生产者消费者;

public class A {
    public static void main(String[] args) {
        Thing th=new Thing();
        new Thread(()->{
            for(int i=1;i<=500;i++) {
                try {
                    th.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();

        new Thread(()->{
            for(int i=1;i<=500;i++) {
                try {
                    th.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"B").start();

        new Thread(()->{
            for(int i=1;i<=500;i++) {
                try {
                    th.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"C").start();

        new Thread(()->{
            for(int i=1;i<=500;i++) {
                try {
                    th.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"D").start();
    }
}



class Thing{
    public static int number=0;
    public synchronized void increment() throws Exception {
        while(number!=0){
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName()+"----number增加到:"+number);
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        while(number==0){
            this.wait();
        }
        number--;
        System.out.println(Thread.currentThread().getName()+"----number减少到:"+number);
        this.notifyAll();
    }


}