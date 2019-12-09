package com.advrps.gameplay;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.NotImplementedException;

public enum MoveShape {
    //this got tricky because I can't reference the MoveShapes that each MoveShape beats
    //    until they are defined, so it ended up being a bit hacky
    ROCK(1, List.of(3, 5)),
    PAPER(2, List.of(2, 4)),
    SCISSORS(3, List.of(1, 5)),
    SPOCK(4, List.of(3, 1)),
    LIZARD(5, List.of(2, 4));

    // Pokemon types, or etc

    private int val;
    private List<Integer> intBeats = null;
    private List<MoveShape> shapeBeats = null;

    private MoveShape(int value, List<Integer> winAgainstShapes) {
        val = value;
        intBeats = winAgainstShapes;
    }

    public static MoveShape fromValue(int val) {
        switch (val) {
        case 1:
            return MoveShape.ROCK;
        case 2:
            return MoveShape.PAPER;
        case 3:
            return MoveShape.SCISSORS;
        case 4:
            return MoveShape.SPOCK;
        case 5:
            return MoveShape.LIZARD;
        default:
            throw new NotImplementedException("New move shape not recognized: " + val);
        }
    }

    public boolean winsAgainst(MoveShape opponentMove) {
        if(shapeBeats == null){
            //convert and cache ints to shapes
            shapeBeats = new ArrayList<>();
            for(Integer shapeInt : intBeats){
                shapeBeats.add(fromValue(shapeInt));
            }
        }

        boolean beatsOpponentMove = shapeBeats.contains(opponentMove) ? true : false;
        return beatsOpponentMove;
    }
}