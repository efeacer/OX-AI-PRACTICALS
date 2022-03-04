package search;

public class Node {
	public final Node parent;
	public final Action action;
	public final State state;
	public int depth;
	public int value;
	public int pathCost;

	public Node(Node parent, Action action, State state) {
		this.parent = parent;
		this.action = action;
		this.state = state;
		if (parent == null) {
			depth = 0;
			pathCost = 0;
		} else {
			depth = parent.depth + 1;
			pathCost += action.cost();
		}

	}

	public void setValue(int value) {
		this.value = value;
	}
}
