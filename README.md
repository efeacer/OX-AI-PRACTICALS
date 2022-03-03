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


## Practical 2