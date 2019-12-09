package com.advrps.gameplay;

import com.advrps.gameplay.WinCondition;

public class Hand {
    private MoveShape player1Move = null;
    private MoveShape player2Move = null;

    public Hand(MoveShape p1, MoveShape p2){
        player1Move = p1;
        player2Move = p2;
    }

    public WinCondition getWinner() {
        if(player1Move.equals(player2Move)) return WinCondition.WIN_TIE;
        if(player1Move.winsAgainst(player2Move)) return WinCondition.WIN_P1;
        if(player2Move.winsAgainst(player1Move)) return WinCondition.WIN_P2;
        
        return WinCondition.WIN_UNKNOWN;
    }

    public MoveShape getPlayer1Move() {
        return player1Move;
    }

    public MoveShape getPlayer2Move() {
        return player2Move;
    }
}