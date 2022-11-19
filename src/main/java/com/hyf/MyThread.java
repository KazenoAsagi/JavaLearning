package com.hyf;

public class MyThread implements Runnable {
    private int total = 50;
    
    @Override
    public void run() {
        Thread th = Thread.currentThread();
        boolean flag = true;
        while (flag) {
            synchronized (this) {
                if (total > 0) {
                    System.out.println(th.getName() + "卖出了第" + (51 - total) + "张票");
                    total--;
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (total == 0) {
                flag = false;
            }
        }
    }
}
