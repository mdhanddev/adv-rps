package com.advrps.gameplay;

public class AiPlayer extends Player {
    public AiPlayer() {
        super("Computer"); //TODO or maybe something intimidating like a UUID or random name generator
    }

    @Override
    public boolean isHuman() {
        return false;
    }
}