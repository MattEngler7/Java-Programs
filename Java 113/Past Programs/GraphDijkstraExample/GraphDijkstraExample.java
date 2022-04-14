import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



class Graph {
 
    private Set<Node> nodes = new HashSet<>();
     
    public void addNode(Node node) {
        nodes.add(node);
    }
    
    public Set<Node> getNodes()
    {
    	return nodes;
    }
 
}


class Node {
    
    private String name;
     
    private List<Node> shortestPath = new LinkedList<>();
     
    private Integer distance = Integer.MAX_VALUE;
     
    Map<Node, Integer> adjacentNodes = new HashMap<>();
 
    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }
  
    public Node(String name) {
        this.name = name;
    }
    
    public void setDistance(int dist)
    {
    	distance = dist;
    }
    
    public int getDistance()
    {
    	return distance;
    }
    
    public Map<Node,Integer> getAdjacentNodes()
    {
    	return adjacentNodes;
    }
    
    public List<Node> getShortestPath()
    {
    	return shortestPath;
    }
    
    public void setShortestPath(List<Node> newshortestpath)
    {
    	shortestPath = newshortestpath;
    }
    
    @Override
    public String toString()
    {
    	return name;
    }
     
}



class Dijkstra
{

	public static Graph calculateShortestPathFromSource(Graph graph, Node source) {
	    //Setting the distance to zero
		source.setDistance(0);
	 
		//List of unsettled nodes
	    Set<Node> unsettledNodes = new HashSet<>();
	 
	    //Takes each node "n" and put them in the graph
	    for(Node n : graph.getNodes()) 
	    {
	    	//adds the unsettled nodes to "n" which is put into the graph
	    	unsettledNodes.add(n);
	    }
	    //since unsettled node's size does not equal zero find lowest distance to unsettledNode
	    while (unsettledNodes.size() != 0) {
	        Node currentNode = getLowestDistanceNode(unsettledNodes);
	        unsettledNodes.remove(currentNode);//the current node is then removed so it is not used again.
	        for (Entry < Node, Integer> adjacencyPair: currentNode.getAdjacentNodes().entrySet())
	        {
	        	Node adjacentNode = adjacencyPair.getKey();//The Key is the "terminal"
	            Integer edgeWeight = adjacencyPair.getValue();//The value is the "cost"(weight)
	            CalculateMinimumDistance(adjacentNode, edgeWeight, currentNode);//this is used cause it calls the "CalculateMinimumDistance" part in the code and- 
	            																//goes through its for loop to calculate the minimum distance to the next terminal.
	            
	        }
	        
	    }
	    return graph;
	}

	private static Node getLowestDistanceNode(Set < Node > unsettledNodes) {
	    Node lowestDistanceNode = null;//is set to zero
	    int lowestDistance = Integer.MAX_VALUE;//is set to infinity just like in the Zybook Ex
	    for (Node node: unsettledNodes) {
	        int nodeDistance = node.getDistance();//gets the nodes distance
	        if (nodeDistance < lowestDistance) {//if the nodes distance is less than the lowest distance on that node then the lowest distance equals the nodes distance replacing the distance.
	            lowestDistance = nodeDistance;
	            lowestDistanceNode = node;//that lowest distance is then set to that node
	        }
	    }
	    return lowestDistanceNode;
	}

	private static void CalculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode)
	{
			    Integer sourceDistance = sourceNode.getDistance();//sourceDistance is set to equal sourceNode.getDistance which is the Node's distance
			    if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
			        evaluationNode.setDistance(sourceDistance + edgeWeigh);
			        LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());//If the source distance is less than the evaluation node then it is put into a new linked list.
			        shortestPath.add(sourceNode);//it is then added to shortestPath
			        evaluationNode.setShortestPath(shortestPath);//Evaluation node then updates the shortestPath with the .setShortestPath
			    }
	}
}

public class GraphDijkstraExample
{
	
	public static void main(String args[])
	{
		
		Node nodeA = new Node("A");
		Node nodeB = new Node("B");
		Node nodeC = new Node("C");
		Node nodeD = new Node("D"); 
		Node nodeE = new Node("E");
		Node nodeF = new Node("F");
		Node nodeG = new Node("G");
		Node nodeH = new Node("H");

		//Node A connections
		nodeA.addDestination(nodeB, 155);
		nodeA.addDestination(nodeH, 115);
		nodeA.addDestination(nodeG, 278);
		
		//Node B connections
		nodeB.addDestination(nodeC,168);
		nodeB.addDestination(nodeA, 155);
		
		//Node C connections
		nodeC.addDestination(nodeD, 250);
		nodeC.addDestination(nodeB, 168);
		
		//Node D connections
		nodeD.addDestination(nodeH, 65);
		nodeD.addDestination(nodeE, 280);
		nodeD.addDestination(nodeC, 250);
		
		//Node E connections
		nodeE.addDestination(nodeF, 145);
		nodeE.addDestination(nodeD, 280);
		
		//Node F connections
		nodeF.addDestination(nodeH, 218);
		nodeF.addDestination(nodeG, 315);
		nodeF.addDestination(nodeE, 145);
		
		//Node G connections
		nodeG.addDestination(nodeF, 315);
		nodeG.addDestination(nodeH, 78);
		nodeG.addDestination(nodeA, 278);
		
		//Node H connections
		nodeH.addDestination(nodeF, 218);
		nodeH.addDestination(nodeG, 78);
		nodeH.addDestination(nodeA, 115);
		nodeH.addDestination(nodeD, 65);
		 
		Graph graph = new Graph();
		
		//Adding all the nodes to the graph 
		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);
		graph.addNode(nodeG);
		graph.addNode(nodeH);
		 
		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);
		
		for (Node node: graph.getNodes())
		System.out.println(node.toString() + node.getDistance() + node.getShortestPath());
	
	}
}