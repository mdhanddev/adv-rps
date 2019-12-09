package com.advrps.gameplay;

public class HumanPlayer extends Player {
    
    public HumanPlayer(String playerName) {
        super(playerName);
    }

    @Override
    public boolean isHuman() {
        return true;
    }
}