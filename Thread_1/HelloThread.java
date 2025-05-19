package org.study.Thread_1;

/**
 * @author rua
 */

public class HelloThread extends Thread {
    @Override
    public void run() {
        System.out.println("[main] 프로그램 시작");
        int count = 0;
        while (count < 5) {
            System.out.println("Hello from thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            count++;
        }
        System.out.println("[main] 프로그램 종료");
    }
}