package algorithms;

import java.util.ArrayList;
import java.util.List;

public class BSTSort {
	
	public List<Integer> sort(List<Integer> list) {
	
		Node tree = null;
		for(Integer value : list) {
			Node newNode = new Node(value,null,null);
			tree = insert(tree,newNode);
		}
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		traverse(tree,sortedList);
		return sortedList;
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
	
	private void traverse(Node node, ArrayList<Integer> sortedList) {
		if(node == null) {
			return;
		}
		traverse(node.left, sortedList);
		sortedList.add(node.value);
		traverse(node.right,sortedList);
	}
}
