package com.hom.som.Challenges;

import com.hom.som.Utilities.BinaryBiolerPlate;
import com.hom.som.Utilities.BinaryTreeNode;

public class C_8_UniversalBinaryTreeCount {

	static int count = 0;
	
	public static void main(String[] args) {
		com.hom.som.Utilities.BinaryTree tree = new com.hom.som.Utilities.BinaryTree();
		tree = BinaryBiolerPlate.initializeUniversalTree(tree);
		count = countUniVals(tree.root);
		System.out.println("count "+count);
		
	}

	private static int countUniVals(BinaryTreeNode root) {
		if(root == null)
			return 0;
		isUni(root);
		return count;
	}

	private static boolean isUni(BinaryTreeNode current) {
		if(current.left == null && current.right == null) {
			count++;
			return true;
		}
		boolean subCheck = true;
		
		if(current.left != null) {
			subCheck = isUni(current.left) && subCheck && (current.key == current.left.key);
		}
		
		if(current.right != null) {
			subCheck = isUni(current.right) && subCheck && (current.key == current.right.key);
		}
		
		if(!subCheck) {
			return false;
		}
		count++;
		return true;
	}
}
