package org.study.Aggregation;

/**
 * @author rua
 */
public class Player {
    private String name;
    private String team;

    public Player(String name) {
        this.name = name;
        this.team = "Free";
    }
    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public void addTeam(String team) {
        this.team = team;
    }
}
