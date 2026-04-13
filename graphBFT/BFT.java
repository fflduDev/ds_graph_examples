package graphBFT;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFT<T> {

	Queue<Node<T>> queue = new LinkedList<Node<T>>();
 
	public void bfs(Node<T> node) {
		queue.add(node);
		node.visited = true;
		while (!queue.isEmpty()) {

			Node<T> element = queue.remove();
			System.out.println("\n city: " + element.data + "\t");
			List<Node<T>> neighbours = element.getNeighbours();
			System.out.println("neighbors: ");

			for (int i = 0; i < neighbours.size(); i++) {
				Node<T> n = neighbours.get(i);
				if (n != null && !n.visited) {
					queue.add(n);
					n.visited = true;
					System.out.print("\t" + n.data + "\t");

				}
			}
		}
	}
		
		
		public void bfs(Node<T> node, Node<T> destination) {
			queue.add(node);
			node.visited = true;
			while (!queue.isEmpty()) {

				Node<T> element = queue.remove();
				System.out.println("\n city: " + element.data + "\t");
				List<Node<T>> neighbours = element.getNeighbours();
				System.out.println("neighbors: ");

				for (int i = 0; i < neighbours.size(); i++) {
					Node<T> n = neighbours.get(i);
					if (n != null && !n.visited) {
						queue.add(n);
						n.visited = true;
						System.out.print("\t" + n.data + "\t");

					}
					if (n.data.equals(destination.data)) {
						System.out.println("\t destination found --> " + n.data + "\t");
						return;
					}
						
				}
			}
		}
}
