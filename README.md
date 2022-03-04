# OXFORD AI PRACTICALS

## Practical 1

### Task 1: Encapsulate the Notion of A Frontier

- ```Frontier.java``` The ***Frontier*** interface.
- ```DepthFirstFrontier.java``` Implements the ***Depth First Frontier*** using a LIFO Stack.
- ```BreadthFirstFrontier.java``` Implements the ***Breadth First Frontier*** using a FIFO Queue.

### Task 2: State Equality 

- ```State.java``` The notion of equality is added by adding ```equals``` and ```hashCode``` methods.
- ```Tiles.java``` Equality is implemented (auto Intelli J override) 
- ```City.java``` Equality is implemented (auto Intelli J override)
- ```TourState.java``` Equality is implemented (auto Intelli J override)

### Task 3: Encapsulate Search Algorithms

- ```Search.java``` The ***Search*** interface.
- ```TreeSearch.java``` Encapsulates the ***Tree Search*** algorithm.
- ```GraphSearch.java``` Encapsulates the ***Graph Search*** algorithm.
- ```numNodesGenerated``` is added to ***Search*** files keep track of the number of nodes generated in a 
  ```solve``` execution as a performance tracker.
- ```maxNodesStored``` is added to ***Frontier*** files keep track of the maximum number of nodes stored on the 
  frontier since the frontier was created as a memory tracker.

### Task 4: Implement Iterative Deepening (Optional)

- ```IterativeDeepeningSearch.java``` Encapsulates the ***Iterative Deepening Tree Search*** algorithm.
- ```depth``` field is added to ```Node.java```.

### Task 5: Compare Efficiency

- ```Main.java``` contains the tests. Graph Search algorithms tend to explore and store fewer nodes as they 
  keep track of explored nodes and do not re-explore. Breadth First Search algorithms also tend to explore fewer
  nodes as they have strong optimality guarantees for uniform cost edges, this is not always the case though.

## Practical 2

### Task 1: Implement Best-First Search

- ```NodeFunction.java``` The interface to define mappings from nodes to the nodes desirability 
  value as an integer.
- ```value``` field is added to the ```Node``` class.
- ```BestFirstFrontier.java``` Implements the ***Best First Frontier*** using a Priority Queue.

### Task 2: Implement the A* Node Function

- ```Action.java``` interface is extended by adding the ```cost``` method.
- ```Node.java``` interface is extended by adding the ```pathCost``` field that keeps track of the 
  cost of the path from the root to the node.
- ```AStarFunction.java``` is implemented to incorporate heuristics to the path costs.

### Task 2: Implement a Heuristic for the n-Puzzle

- ```MisplacedTilesHeuristicFunction.java``` implements a heuristic for the n-Puzzle problem.

### Task 3 (Optional): Implement a Heuristic for the Romania Tour

### Task 4: Compare Efficiency
