package com.ailk.ams.threadSMSOnlyNextAccount;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author KznAsg
 * @version 2022/10/11  下午 5:41
 * @description 用ThreadLocal能否实现线程私有的变量
 * @page
 * @link
 */

public class AlipayIdPayFailDealThread2 implements Runnable {
    
    private static final ThreadLocal<int[]> threadLocal = new ThreadLocal<>();
    
    
    public AlipayIdPayFailDealThread2() {
    }
    
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor =
              new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS,
                    new ArrayBlockingQueue<Runnable>(100));
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        AlipayIdPayFailDealThread2 thisThread1 = new AlipayIdPayFailDealThread2();
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(thisThread1);
        }
        
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);
        
    }
    
    @Override
    public void run() {
        threadLocal.set(new int[6]);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Random random = new Random();
        threadLocal.get()[1] += random.nextInt(10);
        System.out.println("threadLocal.get()[1] = " + threadLocal.get()[1]);
        threadLocal.remove();
    }
}
