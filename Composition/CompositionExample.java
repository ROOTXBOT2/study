package org.study.Composition;

import java.util.ArrayList;

/**
 * @author rua
 */
public class CompositionExample {
    public static void main(String[] args) {
        Library L1 = new Library("L1");
        Library L2 = new Library("L2");

        L1.addBook("A","A-1");
        L1.addBook("B","B-1");

        L2.addBook("A","A-2");
        L2.addBook("B","B-2");

        L1.printBooks();
        System.out.println("-------------------------------------");
        L2.printBooks();
    }
}
