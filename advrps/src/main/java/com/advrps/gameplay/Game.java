package com.advrps.gameplay;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// a "game" is a series of "hands" until one player or the other
//    has won enough "hands" to be the winner of the "game"
//    (i.e. "best of 3")
public class Game {
    private Player p1 = null;
    private Player p2 = null;

    private UUID gameId = null;

    private List<Hand> hands = new ArrayList<>();

    public Game(Player player1, Player player2){
        p1 = player1;
        p2 = player2;
        gameId = UUID.randomUUID();
    }

    public Player getPlayer1() {
        return p1;
    }

    public Player getPlayer2() {
        return p2;
    }

    public String getGameId() {
        return gameId.toString();
    }

    public WinCondition getWinner() {
        //TODO
        //go through hands and determine if any player has won enough hands to win the game

        return WinCondition.WIN_UNKNOWN;
    }
}