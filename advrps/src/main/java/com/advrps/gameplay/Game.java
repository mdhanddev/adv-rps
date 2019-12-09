package com.advrps.gameplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

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

    public void addHand(Hand hand) {
        //don't just add the winner, we want to see the moves that were made
        hands.add(hand);
    }

    public WinCondition getWinner() {
        Map<Boolean, List<WinCondition>> winsByPlayer = hands.stream()
             .map(hand -> hand.getWinner())
             .filter(wc -> wc == WinCondition.WIN_TIE || wc == WinCondition.WIN_P1)
             .collect(Collectors.groupingBy(wc -> wc == WinCondition.WIN_P1));

        List<WinCondition> player1Wins = winsByPlayer.get(true);
        List<WinCondition> player2Wins = winsByPlayer.get(false);

        if(player1Wins.size() >= 3) return WinCondition.WIN_P1;
        if(player2Wins.size() >= 3) return WinCondition.WIN_P2;

        return WinCondition.WIN_UNKNOWN;
    }
}