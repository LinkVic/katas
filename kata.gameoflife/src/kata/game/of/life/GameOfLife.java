package kata.game.of.life;

import java.util.ArrayList;
import java.util.List;


public class GameOfLife {

    private List<List<Object>> gameWorld;

    public GameOfLife(final int worldSize) {
        this.gameWorld = new ArrayList<List<Object>>();
        addLandOfTheWorld(worldSize);
        
    }

    public List<List<Object>> getWorld() {
        return gameWorld;
    }
    
    private ArrayList<Object> getAPieceOfLand(final int worldSize) {
        ArrayList<Object> land = new ArrayList<Object>();
        addPieceOfLand(land, worldSize, null);
        return land;
    }
    
    private void addLandOfTheWorld(final int worldSize) {
        int landAdded = 0;
        while (landAdded < worldSize) {
            this.gameWorld.add(getAPieceOfLand(worldSize));
            landAdded++;
        }
    }

    private void addPieceOfLand(final List<Object> land, final int worldSize, final Object pieceOfTheLand) {
        int landAdded = 0;
        while (landAdded < worldSize) {
            addLand(land, pieceOfTheLand);
            landAdded++;
        }
    }

    private void addLand(final List<Object> place, final Object land) {
        place.add(land);
    }

}
