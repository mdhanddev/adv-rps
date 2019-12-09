package com.advrps.gameplay;

import org.apache.commons.lang.NotImplementedException;

public enum MoveShape {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);
    // TODO
    // SPOCK
    // LIZARD

    // Pokemon types, or etc

    private int val;

    private MoveShape(int value) {
        val = value;
    }

    public static MoveShape fromValue(int val) {
        switch (val) {
        case 1:
            return MoveShape.ROCK;
        case 2:
            return MoveShape.PAPER;
        case 3:
            return MoveShape.SCISSORS;
        default:
            throw new NotImplementedException("New move shape not recognized: " + val);
        }
    }
}