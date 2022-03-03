package search;

/**
 * An interface to encapsulate the notion of a Search Algorithm.
 * @author Efe Acer
 */
public interface Search {

    /**
     * Given a root node and a goal test, returns a node containing a solution
     * or null if no solution can be found.
     * @param root The root node to begin the search from
     * @param goalTest The goal test applied to test the solutions
     * @return The node containing a solution or null if no solution can be found
     */
    Node solve(Node root, GoalTest goalTest);

    /**
     * Returns the number of nodes generated during the last search as a performance measure.
     * @return The number of nodes generated during the last search.
     */
    int numNodesGenerated();
}
