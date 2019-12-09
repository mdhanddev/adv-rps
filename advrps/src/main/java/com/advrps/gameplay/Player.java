package com.advrps.gameplay;

public abstract class Player {
    private String name;

    public Player(String playerName) {
        name = playerName;
    }

    public String getName() {
        return name;
    }

    public abstract boolean isHuman();
}