package search;

import java.util.Set;

/**
 * An interface to represent a State in a Search Algorithm.
 * @author Efe Acer
 */
public interface State {

	Set<? extends Action> getApplicableActions();

	State getActionResult(Action action);

	/**
	 * Method to specify the notion of equality among two States.
	 * @param that The Object to compare with
	 * @return true if the Objects represent the same State, false otherwise
	 */
	boolean equals(Object that);

	/**
	 * Method to specify how State objects are hashed.
	 * @return The hash of the State objects
	 */
	int hashCode();
}
