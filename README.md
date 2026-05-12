A. Project Overview
This project focuses on implementing and analyzing fundamental graph data structures and traversal algorithms. Using an Adjacency List representation , the system manages nodes (vertices) and their connections (edges) to facilitate efficient data exploration.  

Vertices (Nodes): Represent individual entities within the graph.  

Edges (Connections): Represent the relationship or path between two vertices.  

BFS & DFS: Core algorithms used to visit every node in the graph systematically.  


B. Class Descriptions
The implementation is structured into the following required Java classes:  

Vertex: Represents a node with a unique id.  
Edge: Represents a directed or undirected connection between a source and a destination vertex.  
Graph: Manages the graph structure using an Adjacency List and contains the logic for addEdge, addVertex, and traversal methods.  

Experiment: Handles the execution of multiple tests to measure performance across different graph sizes.  
C. Algorithm Descriptions
1. Breadth-First Search (BFS)

Step-by-Step: BFS starts at a designated node and explores all neighbor nodes at the present depth level before moving on to nodes at the next depth level. It typically utilizes a Queue.  


Use Cases: Finding the shortest path in unweighted graphs and social networking analysis.  

Time Complexity: O(V+E), where V is the number of vertices and E is the number of edges.  


2. Depth-First Search (DFS)

Step-by-Step: DFS starts at a designated node and explores as far as possible along each branch before backtracking. It is implemented using a Stack or Recursion.  


Use Cases: Pathfinding, cycle detection, and topological sorting.  

Time Complexity: O(V+E).  


D. Experimental Results
Based on the provided execution data for a large graph:

Graph Size (Vertices)	BFS Execution Time (ns)	DFS Execution Time (ns)
100 Vertices	738,625 ns	595,917 ns
Measurements were captured using System.nanoTime() as required by the assignment.  

E. Analysis
Graph Size Impact: As the number of vertices increases from 10 to 100, the execution time for both BFS and DFS increases, demonstrating the correlation between input size and performance.  


Performance: In the conducted experiment for 100 vertices, DFS proved to be faster than BFS.

Complexity: The results align with the expected O(V+E) complexity, as the time increase is proportional to the growth of the graph's structure.  

BFS Preference: BFS is preferred when the goal is to find the shortest path or when the target is likely close to the starting point.  

DFS Limitations: DFS can get "lost" in deep branches and does not guarantee finding the shortest path.  

F. Reflection Section
This assignment provided a practical understanding of how graph structures are represented in memory using Adjacency Lists. Implementing both BFS and DFS highlighted the fundamental differences in how they explore data (width vs. depth). A key challenge was ensuring thread-safe time measurements and managing vertex IDs correctly during the creation of larger graphs.  
