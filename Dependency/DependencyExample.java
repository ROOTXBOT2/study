package org.study.Dependency;

/**
 * @author rua
 */
public class DependencyExample {
    public static void main(String[] args) {
        Document D1 = new Document("D1 print");
        Document D2 = new Document("D2 print");
        Document D3 = new Document("D3 print");

        Printer printer = new Printer();
        printer.print(D1);
        printer.print(D2);
        printer.print(D3);
    }
}
