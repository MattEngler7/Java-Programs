public class Main {

	public static void main(String[] args) {
		int getWeight;
		Graph myGraph = new Graph(8);
		
		myGraph.addEdge(2,1,38);
		myGraph.addEdge(1,5,19);
		myGraph.addEdge(1,4,11);
		myGraph.addEdge(1,3,35);
		myGraph.addEdge(4,3,27);
		myGraph.addEdge(3,5,28);
		myGraph.addEdge(3,6,13);
		myGraph.addEdge(5,6,26);
		
		System.out.println("Connected 6 and 2: " + myGraph.isConnected(6, 2));
		System.out.println();
		System.out.println("Connected 1 and 6: " +myGraph.isConnected(1,6));
		
		getWeight = myGraph.getWeight(6,3);
		getWeight = getWeight + myGraph.getWeight(3,1);
		getWeight = getWeight + myGraph.getWeight(1, 2);
		System.out.println("Travel Time is " + getWeight + "min");
	}

}