package com.advrps.gameplay;

import org.apache.commons.lang.NotImplementedException;

public enum WinCondition {
    WIN_TIE(0),
    WIN_P1(1),
    WIN_P2(2),
    WIN_UNKNOWN(-1);

    private int value;

    private WinCondition(int val) {
        value = val;
    }

    public static WinCondition fromValue(int val) {
        switch(val) {
            case 0:
                return WinCondition.WIN_TIE;
            case 1:
                return WinCondition.WIN_P1;
            case 2:
                return WinCondition.WIN_P2;
            default:
                throw new NotImplementedException("Win condition not recognized: " + val);
        }
    }
}