package algorithms;

import java.util.List;

public class BSTSort {
	int currentIndex;
	
	public void sort(List<Integer> list) {	
		Node tree = null;
		for(Integer value : list) {
			Node newNode = new Node(value,null,null);
			tree = insert(tree,newNode);
		}
		
		currentIndex = 0;
		traverse(tree,list);
	}
	
	private class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;			
		}
	}
	
	public Node insert(Node tree, Node newNode) {
		Node parent = null;
		Node currentNode = tree;
		while(currentNode != null) {
			parent = currentNode;
			if(newNode.value < currentNode.value) {
				currentNode = currentNode.left;
			}
			else {
				currentNode = currentNode.right;
			}
		}
		if(parent == null) {
			tree = newNode;
		}
		else {
			if(parent.value > newNode.value) {
				parent.left = newNode;
			}
			else {
				parent.right = newNode;
			}
		}
		return tree;
	}
	
	private void traverse(Node node, List<Integer> sortedList) {
		if(node == null) {
			return;
		}
		traverse(node.left, sortedList);
		sortedList.set(currentIndex, node.value);
		currentIndex++;
		traverse(node.right,sortedList);
	}
}
