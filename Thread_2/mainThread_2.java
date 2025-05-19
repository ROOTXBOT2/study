package org.study.Thread_2;

/**
 * @author rua
 */
public class mainThread_2 {
    public static void main(String[] args) {

        ApplePrinter applePrinter = new ApplePrinter();
        BananaPrinter bananaPrinter = new BananaPrinter();

        Thread t1 = new Thread(applePrinter);
        Thread t2 = new Thread(bananaPrinter);

        System.out.println("Main Thread 시작");
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Main Thread 종료");
    }
}
