import npuzzle.MisplacedTilesHeuristicFunction;
import npuzzle.NPuzzlePrinting;
import npuzzle.Tiles;
import npuzzle.TilesGoalTest;
import search.*;

public class DemoPractical2 {

    private static final String SEPARATOR1 = "==============================";
    private static final String SEPARATOR2 = "------------------------------";

    private static final String[] PROBLEM_NAMES = {
            "N-PUZZLE",
            "TOUR"
    };

    private static final String[] SEARCH_ALGORITHMS = {
            "A STAR TREE SEARCH",
            "A STAR GRAPH SEARCH"
    };

    public static void main(String [] args) {

        System.out.println(SEPARATOR1);
        System.out.println(PROBLEM_NAMES[0] + " EXAMPLE");

        TreeSearch aStarTreeSearch = new TreeSearch(
                new BestFirstFrontier(
                        new AStarFunction(new MisplacedTilesHeuristicFunction())
                )
        );
        GraphSearch aStarGraphSearch = new GraphSearch(
                new BestFirstFrontier(
                        new AStarFunction(new MisplacedTilesHeuristicFunction())
                )
        );

        Tiles initialConfiguration = new Tiles(new int[][] {
                { 7, 4, 2 },
                { 8, 1, 3 },
                { 5, 0, 6 }
        });
        GoalTest goalTest = new TilesGoalTest();
        Node rootNode = new Node(null, null, initialConfiguration);
        Node solution;
        /**
        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[0]);
        solution = aStarTreeSearch.solve(rootNode, goalTest);
        new NPuzzlePrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: " + aStarTreeSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                aStarTreeSearch.frontier.maxNodesStored());
        **/
        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[1]);
        solution = aStarGraphSearch.solve(rootNode, goalTest);
        new NPuzzlePrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: " + aStarGraphSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                aStarGraphSearch.frontier.maxNodesStored());
    }
}