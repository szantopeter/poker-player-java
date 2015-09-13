package org.leanpoker.player;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.leanpoker.player.gamestate.GameState;

public class PlayerTest {

    @Test
    public void testBetRequest() throws Exception {
        assertEquals(0, Player.betRequest(new GameState()));
    }
}
