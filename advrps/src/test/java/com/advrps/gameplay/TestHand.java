package com.advrps.gameplay;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestHand {

    @Test
    public void testHandCreate() {
        Hand hand = new Hand(MoveShape.PAPER, MoveShape.ROCK);

        assertEquals(MoveShape.PAPER, hand.getPlayer1Move());
        assertEquals(MoveShape.ROCK, hand.getPlayer2Move());

        assertNotEquals(WinCondition.WIN_UNKNOWN, hand.getWinner());
    }

}