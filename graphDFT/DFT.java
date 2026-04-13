package graphDFT;

import java.util.List;
import java.util.Stack;

public class DFT<T> {

	// Iterative DFS using stack
	public void dfsUsingStack(Node<T> node) {
		Stack<Node<T>> stack = new Stack<Node<T>>();
		stack.add(node);
		while (!stack.isEmpty()) {
			Node<T> element = stack.pop();
			if (!element.visited) {
				System.out.print(element.data + " ");
				element.visited = true;
			}

			List<Node<T>> neighbours = element.getNeighbours();
			for (int i = 0; i < neighbours.size(); i++) {
				Node<T> n = neighbours.get(i);
				if (n != null && !n.visited) {
					stack.add(n);
				}												
			}
		}
	}
	
	
	// Iterative DFS using stack
		public void dfsUsingStack(Node<T> node, Node<T> destination) {
			Stack<Node<T>> stack = new Stack<Node<T>>();
			stack.add(node);
			while (!stack.isEmpty()) {
				Node<T> element = stack.pop();
				if (!element.visited) {
					System.out.println(" current station: " + element.data + " ");
					element.visited = true;
				}

				List<Node<T>> neighbours = element.getNeighbours();
				for (int i = 0; i < neighbours.size(); i++) {
					Node<T> n = neighbours.get(i);
				
					if (n != null && !n.visited) {
						System.out.println(" Neighbor of: " + element.data + ": " + n.data + " ");
						stack.add(n);
					}
					if (n.data.equals(destination.data)) {
						System.out.println(" Neighbor " + n.data  + " matches destination... " + " " + destination.data + "   returning ");
											
						return;
					}
					
				}
			}
		}
	
	
}
