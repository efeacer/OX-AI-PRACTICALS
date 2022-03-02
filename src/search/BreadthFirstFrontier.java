package search;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implements the Breadth First Frontier, essentially a FIFO Queue of Nodes.
 * @author Efe Acer
 */
public class BreadthFirstFrontier implements Frontier {

    Queue<Node> queue = new LinkedList<>();

    @Override
    public void add(Node node) {
        queue.add(node);
    }

    @Override
    public void clear() {
        queue.clear();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public Node remove() {
        return queue.remove();
    }
}
