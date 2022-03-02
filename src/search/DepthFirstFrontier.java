package search;

import java.util.Stack;

/**
 * Implements the Depth First Frontier, essentially a LIFO Stack of Nodes.
 * @author Efe Acer
 */
public class DepthFirstFrontier implements Frontier {

    Stack<Node> stack = new Stack<>();

    @Override
    public void add(Node node) {
        stack.add(node);
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
}
