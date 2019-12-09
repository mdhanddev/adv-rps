package com.advrps.gameplay;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestGame {

    Player player1 = null;
    Player player2 = null;

    Game game = null;

    @Before
    public void setUp() {
        player1 = new HumanPlayer("player 1");
        player2 = new HumanPlayer("player 2");

        game = new Game(player1, player2);
    }

    @Test
    public void testQuickGame() {
        Hand h1 = new Hand(MoveShape.ROCK, MoveShape.SCISSORS);
        Hand h2 = new Hand(MoveShape.ROCK, MoveShape.SCISSORS);
        Hand h3 = new Hand(MoveShape.ROCK, MoveShape.SCISSORS);

        game.addHand(h1);
        game.addHand(h2);
        game.addHand(h3);

        assertTrue("Rock x Scissors 3 times", WinCondition.WIN_P1 == game.getWinner());
    }
}