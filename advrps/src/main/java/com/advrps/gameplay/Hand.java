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
        //TODO custom logic here for determining winner based on any two moves
        //     hardcode a winner for now
        return WinCondition.WIN_P1;
    }

    public MoveShape getPlayer1Move() {
        return player1Move;
    }

    public MoveShape getPlayer2Move() {
        return player2Move;
    }
}