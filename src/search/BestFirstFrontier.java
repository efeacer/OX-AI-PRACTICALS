package search;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Implements the Best First Frontier, essentially a Priority Queue of Nodes.
 * @author Efe Acer
 */
public class BestFirstFrontier implements Frontier {

    private final PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(n -> n.value));

    private final NodeFunction nodeFunction;

    private int maxNodesStored;

    public BestFirstFrontier(NodeFunction nodeFunction) {
        this.nodeFunction = nodeFunction;
        maxNodesStored = 0;
    }

    @Override
    public void add(Node node) {
        node.setValue(nodeFunction.evaluate(node));
        priorityQueue.add(node);
        int priorityQueueSize = priorityQueue.size();
        if (priorityQueueSize > maxNodesStored) {
            maxNodesStored = priorityQueueSize;
        }
    }

    @Override
    public void clear() {
        priorityQueue.clear();
    }

    @Override
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    @Override
    public Node remove() {
        return priorityQueue.remove();
    }

    @Override
    public int maxNodesStored() {
        return maxNodesStored;
    }
}
