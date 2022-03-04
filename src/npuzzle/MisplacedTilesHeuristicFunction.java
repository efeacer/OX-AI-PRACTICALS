package npuzzle;

import search.Node;
import search.NodeFunction;

/**
 * A heuristic for the N-Puzzle problem that returns the number of misplaced tiles in
 * a given problem state.
 * @author Efe Acer
 */
public class MisplacedTilesHeuristicFunction implements NodeFunction {

    @Override
    public int evaluate(Node node) {
        Tiles tiles = (Tiles) node.state;
        int numTiles = tiles.width * tiles.width - 1;
        int numMisplaced = 0;
        for (int i = 0; i < numTiles; i++) {
            if (tiles.tiles[i] != i + 1) {
                numMisplaced++;
            }
        }
        return numMisplaced;
    }
}
