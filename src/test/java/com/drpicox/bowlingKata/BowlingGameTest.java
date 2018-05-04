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
        for (int i = 0; i< n; i++) {
            g.roll(pins);
        }

        assertThat(g.score(), is(0));
    }

    @Test
    public void testAllOnes() throws Exception {
        for (int i = 0; i < 20; i++)
            g.roll(1);

        assertThat(g.score(), is(20));
    }


}
