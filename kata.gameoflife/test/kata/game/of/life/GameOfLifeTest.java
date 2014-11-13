package kata.game.of.life;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class GameOfLifeTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createGameOfLifeClass() {
        GameOfLife gameOfLife = null;
        assertNull(gameOfLife);
    }
    
    @Test
    public void WhenTheGameBeginThenCreateTheWorldWithTheGivenSizeOfOne() throws Exception {
        GameOfLife gameOfLife = new GameOfLife(1);
        List<List<Object>> world = gameOfLife.getWorld();
        assertNotNull(gameOfLife);
        assertEquals(1, world.size());
        assertEquals(1, world.get(0).size());
    }
    
    @Test
    public void WhenTheGameBeginThenCreateTheWorldWithTheGivenSizeOfTwo() throws Exception {
        GameOfLife gameOfLife = new GameOfLife(2);
        List<List<Object>> world = gameOfLife.getWorld();
        assertNotNull(gameOfLife);
        assertEquals(2, world.size());
        assertEquals(2, world.get(0).size());
    }
    
    @Test
    public void WhenTheGameBeginThenCreateTheWorldWithTheGivenSizeOfThree() throws Exception {
        GameOfLife gameOfLife = new GameOfLife(3);
        List<List<Object>> world = gameOfLife.getWorld();
        assertNotNull(gameOfLife);
        assertEquals(3, world.size());
        assertEquals(3, world.get(0).size());
    }

}
