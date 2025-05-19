package org.study.Thead_3;

/**
 * @author rua
 */
public class CounterTwo implements Runnable{
    final String name ="Counter-2";
    private int count = 0;

    @Override
    public synchronized void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " " + count);
            count++;
        }
    };
}
