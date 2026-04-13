package graphDFT;

import java.util.ArrayList;
import java.util.List;

class Node<T> {
	T data;
	boolean visited;
	List<Node<T>> neighbours;

	Node(T data) {
		this.data = data;
		this.neighbours = new ArrayList<>();

	}

	public void addneighbours(Node<T> neighbourNode) {
		this.neighbours.add(neighbourNode);
	}

	public List<Node<T>> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(List<Node<T>> neighbours) {
		this.neighbours = neighbours;
	}
}
