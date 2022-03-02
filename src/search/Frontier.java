package search;

/**
 * An interface to represent a Frontier in a Search Algorithm.
 * @author Efe Acer
 */
public interface Frontier {

    /**
     * Adds a node to the Frontier.
     * @param node The node to be added to the Frontier
     */
    void add(Node node);

    /**
     * Clears the contents of the Frontier.
     */
    void clear();

    /**
     * Tests whether the Frontier is empty.
     * @return true if Frontier is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Removes a Node from the Frontier.
     * @return The node removed from the Frontier
     */
    Node remove();
}
