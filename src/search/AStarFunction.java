package search;

/**
 * The A-Star Function that incorporates a heuristic to the path costs.
 * @author Efe Acer
 */
public class AStarFunction implements NodeFunction {

    private final NodeFunction heuristicFunction;

    public AStarFunction(NodeFunction heuristicFunction) {
        this.heuristicFunction = heuristicFunction;
    }

    @Override
    public int evaluate(Node node) {
        return node.pathCost + heuristicFunction.evaluate(node);
    }
}
