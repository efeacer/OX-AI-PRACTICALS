import npuzzle.NPuzzlePrinting;
import npuzzle.Tiles;
import npuzzle.TilesGoalTest;
import search.*;
import tour.*;

public class Main {

    private static final String SEPARATOR1 = "==============================";
    private static final String SEPARATOR2 = "------------------------------";

    private static final String[] PROBLEM_NAMES = {
            "N-PUZZLE",
            "TOUR"
    };

    private static final String[] SEARCH_ALGORITHMS = {
            "BREADTH FIRST TREE SEARCH",
            "BREADTH FIRST GRAPH SEARCH",
            "DEPTH FIRST TREE SEARCH",
            "DEPTH FIRST GRAPH SEARCH",
            "ITERATIVE DEEPENING TREE SEARCH"
    };

    public static void main(String [] args) {

        System.out.println(SEPARATOR1);
        System.out.println(PROBLEM_NAMES[0] + " EXAMPLE");

        TreeSearch breadthFirstTreeSearch = new TreeSearch(new BreadthFirstFrontier());
        GraphSearch breadthFirstGraphSearch = new GraphSearch(new BreadthFirstFrontier());
        TreeSearch depthFirstTreeSearch = new TreeSearch(new DepthFirstFrontier());
        GraphSearch depthFirstGraphSearch = new GraphSearch(new DepthFirstFrontier());
        IterativeDeepeningTreeSearch iterativeDeepeningTreeSearch = new IterativeDeepeningTreeSearch();

        Tiles initialConfiguration = new Tiles(new int[][] {
                { 7, 4, 2 },
                { 8, 1, 3 },
                { 5, 0, 6 }
        });
        GoalTest goalTest = new TilesGoalTest();
        Node rootNode = new Node(null, null, initialConfiguration);
        Node solution;

        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[0]);
        solution = breadthFirstTreeSearch.solve(rootNode, goalTest);
        //new NPuzzlePrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: " + breadthFirstTreeSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                breadthFirstTreeSearch.frontier.maxNodesStored());

        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[1]);
        solution = breadthFirstGraphSearch.solve(rootNode, goalTest);
        //new NPuzzlePrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: " + breadthFirstGraphSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                breadthFirstGraphSearch.frontier.maxNodesStored());

        /**
        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[2]);
        solution = depthFirstTreeSearch.solve(rootNode, goalTest);
        //new NPuzzlePrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: " + depthFirstTreeSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                depthFirstTreeSearch.frontier.maxNodesStored());
        */

        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[3]);
        solution = depthFirstGraphSearch.solve(rootNode, goalTest);
        //new NPuzzlePrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: " + depthFirstGraphSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                depthFirstGraphSearch.frontier.maxNodesStored());

        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[4]);
        solution = iterativeDeepeningTreeSearch.solve(rootNode, goalTest);
        //new NPuzzlePrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: "
                + iterativeDeepeningTreeSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                iterativeDeepeningTreeSearch.depthFirstFrontier.maxNodesStored());

        // ----------------------------------------------------

        System.out.println(SEPARATOR1);
        System.out.println(PROBLEM_NAMES[1] + " EXAMPLE");

        breadthFirstTreeSearch = new TreeSearch(new BreadthFirstFrontier());
        breadthFirstGraphSearch = new GraphSearch(new BreadthFirstFrontier());
        depthFirstTreeSearch = new TreeSearch(new DepthFirstFrontier());
        depthFirstGraphSearch = new GraphSearch(new DepthFirstFrontier());
        iterativeDeepeningTreeSearch = new IterativeDeepeningTreeSearch();

        Cities romania = SetUpRomania.getRomaniaMapSmall();
        City startCity = romania.getState("Bucharest");

        goalTest = new TourGoalTest(romania.getAllCities(), startCity);
        rootNode = new Node(null, null, new TourState(startCity));

        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[0]);
        solution = breadthFirstTreeSearch.solve(rootNode, goalTest);
        //new TourPrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: " + breadthFirstTreeSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                breadthFirstTreeSearch.frontier.maxNodesStored());

        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[1]);
        solution = breadthFirstGraphSearch.solve(rootNode, goalTest);
        //new TourPrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: " + breadthFirstGraphSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                breadthFirstGraphSearch.frontier.maxNodesStored());

        /**
         System.out.println(SEPARATOR2);
         System.out.println(SEARCH_ALGORITHMS[2]);
         solution = depthFirstTreeSearch.solve(rootNode, goalTest);
         //new NPuzzlePrinting().printSolution(solution);
         System.out.println("Number of nodes generated in the search: " + depthFirstTreeSearch.numNodesGenerated());
         System.out.println("Maximum number of nodes stored in the frontier: " +
         depthFirstTreeSearch.frontier.maxNodesStored());
         */

        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[3]);
        solution = depthFirstGraphSearch.solve(rootNode, goalTest);
        //new TourPrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: " + depthFirstGraphSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                depthFirstGraphSearch.frontier.maxNodesStored());

        System.out.println(SEPARATOR2);
        System.out.println(SEARCH_ALGORITHMS[4]);
        solution = iterativeDeepeningTreeSearch.solve(rootNode, goalTest);
        //new TourPrinting().printSolution(solution);
        System.out.println("Number of nodes generated in the search: "
                + iterativeDeepeningTreeSearch.numNodesGenerated());
        System.out.println("Maximum number of nodes stored in the frontier: " +
                iterativeDeepeningTreeSearch.depthFirstFrontier.maxNodesStored());
    }

}
