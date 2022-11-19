package com.ailk.ams.threadSMSOnlyNextAccount;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author KznAsg
 * @version 2022/10/11  下午 5:41
 * @description 多线程之间是否会影响各自的成员变量
 * @page
 * @link
 */

public class AlipayIdPayFailDealThread implements Runnable {
    
    private static ThreadLocal<int[]> threadLocal = new ThreadLocal<>();
    
    static {
        threadLocal.set(new int[]{0, 1, 2, 3, 4, 5});
    }
    
    private int a;
    
    private int b;
    
    public AlipayIdPayFailDealThread(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor =
              new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS,
                    new ArrayBlockingQueue<Runnable>(100));
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        AlipayIdPayFailDealThread thisThread1 = new AlipayIdPayFailDealThread(1, 2);
        AlipayIdPayFailDealThread thisThread2 = new AlipayIdPayFailDealThread(1, 2);
        threadPoolExecutor.execute(thisThread1);
        threadPoolExecutor.execute(thisThread1);
        threadPoolExecutor.execute(thisThread1);
        threadPoolExecutor.execute(thisThread1);
        threadPoolExecutor.execute(thisThread1);
        threadPoolExecutor.execute(thisThread1);
        threadPoolExecutor.execute(thisThread1);
        // threadPoolExecutor.execute(thisThread2);
        
        
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a++;
        System.out.println("a = " + a);
        b--;
        System.out.println("b = " + b);
    }
}
