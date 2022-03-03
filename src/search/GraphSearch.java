package search;

import java.util.HashSet;
import java.util.Set;

/**
 * Implements the Graph Search algorithm.
 * @author Efe Acer
 */
public class GraphSearch implements Search {

    private final Frontier frontier;

    private int numNodesGenerated;

    GraphSearch(Frontier frontier) {
        this.frontier = frontier;
    }

    @Override
    public Node solve(Node root, GoalTest goalTest) {
        frontier.clear();
        numNodesGenerated = 0;
        Set<State> explored = new HashSet<>();
        frontier.add(root);
        while (!frontier.isEmpty()) {
            Node node = frontier.remove();
            explored.add(node.state);
            if (goalTest.isGoal(node.state)) {
                return node;
            }
            for (Action action : node.state.getApplicableActions()) {
                State childState = node.state.getActionResult(action);
                if (!explored.contains(childState)) {
                    Node childNode = new Node(node, action, childState);
                    numNodesGenerated++;
                    frontier.add(childNode);
                }
            }
        }
        return null;
    }

    @Override
    public int numNodesGenerated() {
        return numNodesGenerated;
    }
}
