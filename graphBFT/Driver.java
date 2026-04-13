package graphBFT;

public class Driver {

	public static void main(String args[]) {

		TEST_CITIES();
		// TEST_INTS();
	}

	static void TEST_CITIES() {

		Node<String> atlantaNode = new Node<>("Atlanta");
		Node<String> austinNode = new Node<>("Austin");
		Node<String> chicagoNode = new Node<>("Chicago");

		Node<String> dallasNode = new Node<>("Dallas");

		Node<String> denverNode = new Node<>("Denver");
		Node<String> houstonNode = new Node<>("Houston");
		Node<String> washingtonNode = new Node<>("Washington");

		atlantaNode.addneighbours(houstonNode);
		atlantaNode.addneighbours(washingtonNode);

		austinNode.addneighbours(dallasNode);
		austinNode.addneighbours(houstonNode);

		chicagoNode.addneighbours(denverNode);

		dallasNode.addneighbours(austinNode);
		dallasNode.addneighbours(chicagoNode);
		dallasNode.addneighbours(denverNode);

		denverNode.addneighbours(atlantaNode);
		denverNode.addneighbours(chicagoNode);

		houstonNode.addneighbours(atlantaNode);

		washingtonNode.addneighbours(atlantaNode);
		washingtonNode.addneighbours(dallasNode);

		System.out.println("The BFS traversal of the graph using q ");
		BFT<String> bft = new BFT<String>();
//		bft.bfs(austinNode);

	
		bft.bfs(austinNode, washingtonNode);
		
	}

	static void TEST_INTS() {

		Node node40 = new Node(40);
		Node node10 = new Node(10);
		Node node20 = new Node(20);
		Node node30 = new Node(30);
		Node node60 = new Node(60);
		Node node50 = new Node(50);
		Node node70 = new Node(70);

		node40.addneighbours(node10);
		node40.addneighbours(node20);
		node10.addneighbours(node30);
		node20.addneighbours(node10);
		node20.addneighbours(node30);
		node20.addneighbours(node60);
		node20.addneighbours(node50);
		node30.addneighbours(node60);
		node60.addneighbours(node70);
		node50.addneighbours(node70);
		System.out.println("\nThe BFS traversal of the int graph is ");
		BFT bfsExample = new BFT();
		bfsExample.bfs(node40);
	}

}
