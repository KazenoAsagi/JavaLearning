package com.hyf;

public class sell {
    //    public static int num = 50;
    public static void main(String[] args) throws InterruptedException {
        //        Runnable run = new Runnable() {
        //            @Override
        //            public void run() {
        //                synchronized (Object.class){
        //                    if(num>0){
        //                        num--;
        //                        System.out.println(Thread.currentThread().getName()+"卖出了第"+(50-num)+"张票");
        //                    }
        //                }
        //            }
        //        };
        
        MyThread myThread = new MyThread();
        //        while (num>0) {
        Thread t1 = new Thread(myThread, "1号窗口");
        Thread t2 = new Thread(myThread, "2号窗口");
        Thread t3 = new Thread(myThread, "3号窗口");
        Thread t4 = new Thread(myThread, "4号窗口");
        //            Thread t1 = new Thread(run, "1号窗口");
        //            Thread t2 = new Thread(run, "2号窗口");
        //            Thread t3 = new Thread(run, "3号窗口");
        //            Thread t4 = new Thread(run, "4号窗口");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        //            t2.join();
        //            t3.join();
        //            t4.join();
        //        }
        System.out.println("售票完毕");
    }
}



