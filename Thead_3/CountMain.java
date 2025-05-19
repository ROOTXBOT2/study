package org.study.Thead_3;

/**
 * @author rua
 */
public class CountMain {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread threadOne = new Thread(counter,"counterOne");
        Thread threadTwo = new Thread(counter,"counterTwo");
        Thread threadThree = new Thread(counter,"counterThree"); //threadOne.setName("threadOne");

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        try {

            threadOne.join();
            threadTwo.join();
            threadThree.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted.");
        }
        System.out.println("Final count: " + counter.getCount());
    }
}
