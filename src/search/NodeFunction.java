package search;

/**
 * An interface that defines a node function that maps a node to an integer desirability value.
 * @author Efe Acer
 */
public interface NodeFunction {

    /**
     * Maps a node to an integer value, a value of desirability
     * @param node The given node
     * @return The integer desirability value of the node
     */
    int evaluate(Node node);
}
