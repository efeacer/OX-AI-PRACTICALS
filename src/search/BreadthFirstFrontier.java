package search;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implements the Breadth First Frontier, essentially a FIFO Queue of Nodes.
 * @author Efe Acer
 */
public class BreadthFirstFrontier implements Frontier {

    private final Queue<Node> queue = new LinkedList<>();

    private int maxNodesStored = 0;

    @Override
    public void add(Node node) {
        queue.add(node);
        int queueSize = queue.size();
        if (queueSize > maxNodesStored) {
            maxNodesStored = queueSize;
        }
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

    @Override
    public int maxNodesStored() {
        return maxNodesStored;
    }
}
