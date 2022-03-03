package search;

/**
 * Implements the Tree Search algorithm.
 * @author Efe Acer
 */
public class TreeSearch implements Search {

    public Frontier frontier;

    private int numNodesGenerated;

    public TreeSearch(Frontier frontier) {
        this.frontier = frontier;
    }

    @Override
    public Node solve(Node root, GoalTest goalTest) {
        frontier.clear();
        numNodesGenerated = 0;
        frontier.add(root);
        while (!frontier.isEmpty()) {
            Node node = frontier.remove();
            if (goalTest.isGoal(node.state)) {
                return node;
            }
            for (Action action : node.state.getApplicableActions()) {
                Node childNode = new Node(node, action, node.state.getActionResult(action));
                numNodesGenerated++;
                frontier.add(childNode);
            }
        }
        return null;
    }

    @Override
    public int numNodesGenerated() {
        return numNodesGenerated;
    }
}
