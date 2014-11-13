package kata.game.of.life;

import java.util.ArrayList;
import java.util.List;

public class PairGameOfLife {

    public List<List<Object>> getWorld() {
        List<List<Object>> world = new ArrayList<List<Object>>();
        
        world.add(getAPieceOfLand());
        world.add(getAPieceOfLand());
        world.add(getAPieceOfLand());
        return world;
    }

    private List<Object> getAPieceOfLand() {
        List<Object> pieceOfWorld = new ArrayList<Object>();
        pieceOfWorld.add(null);
        pieceOfWorld.add(null);
        pieceOfWorld.add(null);
        return pieceOfWorld;
    }

    public void addLifeToTheWorld(List<List<Object>> world, Object object, int positionForRowInWorld, int positionForColumnInWorld) {
        world.get(positionForRowInWorld).add(positionForColumnInWorld, object);
    }

    public List<List<Object>> getWorldWithLife() {
        List<List<Object>> worldWithLife = getWorld();
        addLifeToTheWorld(worldWithLife, new Object(), 1, 1);
        return worldWithLife;
    }

    public void stepToNextDay(List<List<Object>> world) {
        world.get(1).add(1, null);
        
    }
    
}
