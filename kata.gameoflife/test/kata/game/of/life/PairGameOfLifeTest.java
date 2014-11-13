package kata.game.of.life;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PairGameOfLifeTest {

    private PairGameOfLife gameOfLife;

    @Before
    public void setUp() throws Exception {
        gameOfLife = new PairGameOfLife();
    }

    @Test
    public void WhenStartTheGameThenInstantiateTheClassGameOfLife() {
        assertNotNull(gameOfLife);
    }

    @Test
    public void WhenTheGameIsInitialicerThenCreateTheGridWorld() throws Exception {
        List<List<Object>> world = gameOfLife.getWorld();
        assertNotNull(world);
        assertEquals(3, world.size());
        for (List<Object> peaceOfWorld : world) {
            assertEquals(3, peaceOfWorld.size());
        }
    }

    @Test
    public void WhenTheWorldIsCreateInTheGameThenCanAddACellInTheFirstRowAndFirstColumn() throws Exception {
        List<List<Object>> world = gameOfLife.getWorld();
        gameOfLife.addLifeToTheWorld(world, new Object(), 0, 0);
        assertNotNull(world.get(0).get(0));
    }

    @Test
    public void WhenTheWorldIsCreateInTheGameThenCanAddACellInTheFirstRowAndSecondColumn() throws Exception {
        List<List<Object>> world = gameOfLife.getWorld();
        gameOfLife.addLifeToTheWorld(world, new Object(), 0, 1);
        assertNotNull(world.get(0).get(1));
    }

    @Test
    public void WhenTheWorldIsCreateInTheGameThenCanAddACellInTheFirstRowAndThirdColumn() throws Exception {
        List<List<Object>> world = gameOfLife.getWorld();
        gameOfLife.addLifeToTheWorld(world, new Object(), 0, 2);
        assertNotNull(world.get(0).get(2));
    }

    @Test
    public void WhenTheWorldIsCreateInTheGameThenCanAddACellInTheSecondRowAndFirstColumn() throws Exception {
        List<List<Object>> world = gameOfLife.getWorld();
        gameOfLife.addLifeToTheWorld(world, new Object(), 1, 0);
        assertNotNull(world.get(1).get(0));
    }

    @Test
    public void WhenTheWorldIsCreateInTheGameThenCanAddACellInTheSecondRowAndSecondColumn() throws Exception {
        List<List<Object>> world = gameOfLife.getWorld();
        gameOfLife.addLifeToTheWorld(world, new Object(), 2, 0);
        assertNotNull(world.get(2).get(0));
    }

    @Test
    public void WhenTheWorldIsCreate_CreateItWithACellInTheFirstRowAndFirstColumn() throws Exception {
        List<List<Object>> world = gameOfLife.getWorldWithLife();
        assertNotNull(world.get(1).get(1));
    }
    
    @Test
    public void CellWithFewerThanTwoLiveNeighborsDies() throws Exception {
        List<List<Object>> world = gameOfLife.getWorldWithLife();
        gameOfLife.stepToNextDay(world);
        assertNull(world.get(1).get(1));
    }

}
