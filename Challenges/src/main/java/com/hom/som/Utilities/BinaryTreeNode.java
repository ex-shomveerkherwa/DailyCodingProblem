package com.hom.som.Utilities;

public class BinaryTreeNode {

	public int key;

	public BinaryTreeNode left, right;

	public BinaryTreeNode(int item) {
		key = item;
		left = right = null;
	}

	public BinaryTreeNode() {
	}

	public int getKey() {
		return key;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

}
