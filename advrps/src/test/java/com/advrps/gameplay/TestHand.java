package com.advrps.gameplay;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestHand {

    @Test
    public void testHandCreate() {
        Hand hand = new Hand(MoveShape.PAPER, MoveShape.ROCK);

        assertEquals(MoveShape.PAPER, hand.getPlayer1Move());
        assertEquals(MoveShape.ROCK, hand.getPlayer2Move());

        assertNotEquals(WinCondition.WIN_UNKNOWN, hand.getWinner());
    }

    @Test
    public void testSamePlay() {
        MoveShape[] shapes = MoveShape.values();

        for(int i = 0; i < shapes.length; i++){
            Hand h = new Hand(shapes[i], shapes[i]);
            assertTrue(h.getWinner() == WinCondition.WIN_TIE);
        }
    }

    @Test
    public void testRockScissors() {
        Hand h = new Hand(MoveShape.ROCK, MoveShape.SCISSORS);
        assertTrue("Rock beats Scissors", h.getWinner() == WinCondition.WIN_P1);

        Hand reverse = new Hand(MoveShape.SCISSORS, MoveShape.ROCK);
        assertTrue("Rock beats Scissors (reverse)", reverse.getWinner() == WinCondition.WIN_P2);
    }

    @Test
    public void testRockSpock() {
        Hand h = new Hand(MoveShape.SPOCK, MoveShape.ROCK);
        assertTrue("Spock beats Rock", h.getWinner() == WinCondition.WIN_P1);

        Hand reverse = new Hand(MoveShape.ROCK, MoveShape.SPOCK);
        assertTrue("Spock beats Rock (reverse)", reverse.getWinner() == WinCondition.WIN_P2);
    }

    //TODO
    // RockLizard
    // RockPaper
    // PaperScissors
    // PaperSpock
    // PaperLizard
    // ScissorsSpock
    // ScissorsLizard
    // SpockLizard


}