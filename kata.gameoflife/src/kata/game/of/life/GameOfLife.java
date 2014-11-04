package kata.game.of.life;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {

    public List<List<Object>> getWorld() {
        List<List<Object>> world = new ArrayList<List<Object>>();
        
        List<Object> pieceOfWorld = new ArrayList<Object>();
        pieceOfWorld.add(new Object());
        pieceOfWorld.add(new Object());
        pieceOfWorld.add(new Object());
        
        world.add(pieceOfWorld);
        world.add(pieceOfWorld);
        world.add(pieceOfWorld);
        return world;
    }
    
}
