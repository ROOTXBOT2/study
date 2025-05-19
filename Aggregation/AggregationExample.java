package org.study.Aggregation;

/**
 * @author rua
 */
public class AggregationExample {
    public static void main(String[] args) {
        Team Skt = new Team("Skt");
        Team Sam = new Team("Sam");
        Team Bob = new Team("Bob");

        Player A = new Player("A");
        Player B = new Player("B");
        Player C = new Player("C");
        Player D = new Player("D");
        Player E = new Player("E");
        Player F = new Player("F");

        Skt.addPlayer(A);
        Skt.addPlayer(C);

        Sam.addPlayer(B);
        Sam.addPlayer(D);

        Bob.addPlayer(F);
        Bob.addPlayer(E);

        Skt.getPlayers();
        Sam.getPlayers();
        Bob.getPlayers();
    }
}
