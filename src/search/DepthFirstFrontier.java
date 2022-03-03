package search;

import java.util.Stack;

/**
 * Implements the Depth First Frontier, essentially a LIFO Stack of Nodes.
 * @author Efe Acer
 */
public class DepthFirstFrontier implements Frontier {

    private final Stack<Node> stack = new Stack<>();

    private int maxNodesStored = 0;

    @Override
    public void add(Node node) {
        stack.add(node);
        int stackSize = stack.size();
        if (stackSize > maxNodesStored) {
            maxNodesStored = stackSize;
        }
    }

    @Override
    public void clear() {
        stack.clear();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public Node remove() {
        return stack.pop();
    }

    @Override
    public int maxNodesStored() {
        return maxNodesStored;
    }
}
