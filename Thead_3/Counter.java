package org.study.Thead_3;

/**
 * @author rua
 */
public class Counter implements Runnable {
    public static int count = 0;

    @Override
    public synchronized void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "] started");

        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println("[" + threadName + "] count: " +count);
        }
        System.out.println("[" + threadName + "] finished");
    }
    public int getCount(){
        return count;
    }
}
