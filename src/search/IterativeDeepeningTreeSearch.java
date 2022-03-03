package search;

public class IterativeDeepeningTreeSearch implements Search {

    private static final int MAX_DEPTH = 1000;

    public DepthFirstFrontier depthFirstFrontier = new DepthFirstFrontier();

    private int numNodesGenerated;

    @Override
    public Node solve(Node root, GoalTest goalTest) {
        depthFirstFrontier.clear();
        numNodesGenerated = 0;
        for (int depthLimit = 0; depthLimit < MAX_DEPTH; depthLimit++) {
            depthFirstFrontier.clear();
            boolean cutOff = false;
            depthFirstFrontier.add(root);
            while (!cutOff && !depthFirstFrontier.isEmpty()) {
                Node node = depthFirstFrontier.remove();
                if (node.depth > depthLimit) {
                    cutOff = true;
                } else {
                    if (goalTest.isGoal(node.state)) {
                        return node;
                    }
                    for (Action action : node.state.getApplicableActions()) {
                        Node childNode = new Node(node, action, node.state.getActionResult(action));
                        numNodesGenerated++;
                        depthFirstFrontier.add(childNode);
                    }
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
