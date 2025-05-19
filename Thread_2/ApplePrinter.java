package org.study.Thread_2;

/**
 * @author rua
 */
public class ApplePrinter implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Apple");
            try{
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
