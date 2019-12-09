package com.advrps.gameplay;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestPlayer {
    private Player human = null;
    private Player ai = null;

    @Before
    public void setUp() {
        human = new HumanPlayer("mike");
        ai = new AiPlayer();
    }

    @Test
    public void testPlayerCreate() {
        assertEquals("mike", human.getName());
    }

    @Test
    public void testHumanity() {
        assertTrue(human.isHuman());
        assertFalse(ai.isHuman());
    }
}