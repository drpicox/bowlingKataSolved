package com.drpicox.bowlingKata;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class BowlingGameTest {

    private Game g;

    @Before
    public void setUp() {
        g = new Game();
    }

    @Test
    public void gutterGame() {
        int n = 20;
        int pins = 0;
        rollMany(n, pins);

        assertThat(g.score(), is(0));
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i< n; i++) {
            g.roll(pins);
        }
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);

        assertThat(g.score(), is(20));
    }


}
