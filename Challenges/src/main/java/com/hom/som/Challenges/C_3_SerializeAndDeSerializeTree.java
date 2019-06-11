package com.hom.som.Challenges;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/*Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, 
 * and deserialize(s), which deserializes the string back into the tree.
*/
public class C_3_SerializeAndDeSerializeTree {

	public static void main(String[] args) {
		BinaryTree tree = Utility.getSimpleTree();
		
		String ser = serialize(tree);
		System.out.println(ser);
		TreeNode root = deserialize(ser); 
		System.out.println("done");
	}

	private static TreeNode deserialize(String ser) {
		Deque<String> nodes = new LinkedList<String>();
		
		nodes.addAll(Arrays.asList(ser.split(",")));
		
		printQueue(nodes);
		
		TreeNode node = buildTree(nodes);
		
		return node;
	}

	private static TreeNode buildTree(Deque<String> nodes) {
		String val = nodes.remove();
		if(val.equalsIgnoreCase("X")) {
			return null;
		}else {
			TreeNode node = new TreeNode();
			node.data=Integer.parseInt(val);
			node.left= buildTree(nodes);
			node.right=buildTree(nodes);
			return node;
		}
	}

	private static void printQueue(Deque<String> nodes) {
		for(String i:nodes)
			System.out.print(i);
		System.out.println();
		
	}

	private static String serialize(BinaryTree tree) {
		StringBuilder sb = new StringBuilder();
		sb = buildString(tree.root,sb);
		return sb.toString();
	}

	private static StringBuilder buildString(TreeNode root,StringBuilder sb) {
		if(root == null ) {
			return sb.append('X').append(',');
		}else {
			sb.append(root.data).append(',');
			buildString(root.left,sb);
			buildString(root.right,sb);
		}
		return sb;
	}

}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
}

class BinaryTree {
	TreeNode root;
	
	BinaryTree(TreeNode node){
		root=node;
	}
}

class Utility {
	static BinaryTree getSimpleTree() {
		TreeNode left = new TreeNode();
		left.data=2;
		
		TreeNode right = new TreeNode();
		right.data=3;
		
		TreeNode root = new TreeNode();
		root.data=1;
		root.left=left;
		root.right=right;
		
		BinaryTree tree = new BinaryTree(root);
		return tree;
	}
}

