package org.study.Aggregation;

import java.util.ArrayList;

/**
 * @author rua
 */
public class Team {
    private ArrayList<Player> players;
    private String name;

    public Team(String name) {
        this.players = new ArrayList<>();
        this.name = name;
    }
    public void addPlayer(Player player) {
        this.players.add(player);
        System.out.println("Add Player Done.");
        player.addTeam(this.name);
    }

    public void getPlayers() {
        for (Player player : this.players) {
            System.out.println(player.getName());
        }
        System.out.println("Get Players Done.");
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
        System.out.println("Remove Player Done.");
    }
}
