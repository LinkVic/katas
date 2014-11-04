package kata.game.of.life;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GameOfLifeTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void WhenStartTheGameThenCreateTheClassGameOfLife() {
        GameOfLife gameOfLife = null;
        assertNull(gameOfLife);
    }

    @Test
    public void WhenStartTheGameThenInstantiateTheClassGameOfLife() {
        GameOfLife gameOfLife = new GameOfLife();
        assertNotNull(gameOfLife);
    }

    @Test
    public void WhenTheGameIsInitialicerThenCreateTheGridWorld() throws Exception {
        GameOfLife gameOfLife = new GameOfLife();
        List<List<Object>> world = gameOfLife.getWorld();
        assertNotNull(world);
        assertEquals(3, world.size());
        for (List<Object> peaceOfWorld : world) {
            assertEquals(3, peaceOfWorld.size());
        }
    }

}
