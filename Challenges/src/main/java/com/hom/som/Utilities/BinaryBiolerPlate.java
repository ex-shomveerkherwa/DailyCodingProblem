package com.hom.som.Utilities;


public class BinaryBiolerPlate {
	
	
	public static BinaryTree initializeBinaryTree(BinaryTree tree) {
		
		tree.root = new BinaryTreeNode(1); 
        tree.root.left = new BinaryTreeNode(2); 
        tree.root.right = new BinaryTreeNode(3); 
        tree.root.left.left = new BinaryTreeNode(4); 
        tree.root.left.right = new BinaryTreeNode(5); 
		
		return tree;
	}
	
	public static BinaryTree initializeUniversalTree(BinaryTree tree) {
		
		tree.root = new BinaryTreeNode(1); 
        tree.root.left = new BinaryTreeNode(1); 
        tree.root.right = new BinaryTreeNode(1); 
        tree.root.right.right = new BinaryTreeNode(1); 
        tree.root.left.left = new BinaryTreeNode(4); 
        tree.root.left.right = new BinaryTreeNode(5); 
		
		return tree;
	}
	
  public static BinaryTree initializeScrambledBinaryTree(BinaryTree tree) {
		
		tree.root = new BinaryTreeNode(10); 
        tree.root.left = new BinaryTreeNode(30); 
        tree.root.right = new BinaryTreeNode(6); 
        tree.root.left.left = new BinaryTreeNode(50); 
        tree.root.left.right = new BinaryTreeNode(9); 
		tree.root.left.right.left=new BinaryTreeNode(1);
        
		return tree;
	}
  
  public static BinaryTree initializeSemiBST(BinaryTree tree) {
		
		tree.root = new BinaryTreeNode(3); 
      tree.root.left = new BinaryTreeNode(2); 
      tree.root.right = new BinaryTreeNode(5); 
      tree.root.left.left = new BinaryTreeNode(1); 
      tree.root.left.right = new BinaryTreeNode(4); 
	return tree;
	}

  
  public static BinaryTree initializeBST(BinaryTree tree) {
		
		tree.root = new BinaryTreeNode(30); 
		  tree.root.left = new BinaryTreeNode(6); 
		  tree.root.right = new BinaryTreeNode(50); 
		  tree.root.right.left = new BinaryTreeNode(40); 
		  tree.root.right.right = new BinaryTreeNode(60); 
		  
		  tree.root.left.left = new BinaryTreeNode(1); 
		  tree.root.left.right = new BinaryTreeNode(10); 
		tree.root.left.right.left=new BinaryTreeNode(9);
      
		return tree;
	}
  	public static BinaryTree initializeBigBinaryTree(BinaryTree tree) {
		
		BinaryTreeNode node19 = new BinaryTreeNode(19);
		
		BinaryTreeNode node18 = new BinaryTreeNode(18);
		node18.right = node19;
		
		
		BinaryTreeNode node15 = new BinaryTreeNode(15);
		node15.left=node18;
		
		BinaryTreeNode node16 = new BinaryTreeNode(16);
		
		BinaryTreeNode node13 = new BinaryTreeNode(13);
		node13.left=node15;
		node13.right=node16;
		
		BinaryTreeNode node17 = new BinaryTreeNode(17);
		
		BinaryTreeNode node14 = new BinaryTreeNode(14);
		node14.left=node17;
		
		BinaryTreeNode node12 = new BinaryTreeNode(12);
		node12.left=node14;
		
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		node7.left=node12;
		node7.right=node13;
		
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		node3.left=node6;
		node3.right=node7;
		
		BinaryTreeNode node10 = new BinaryTreeNode(10);
		
		BinaryTreeNode node11 = new BinaryTreeNode(11);
		
		BinaryTreeNode node9 = new BinaryTreeNode(9);
		node9.left=node10;
		node9.right=node11;
		
		BinaryTreeNode node8 = new BinaryTreeNode(8);
		
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		node4.left=node8;
		node4.right=node9;
		
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		node2.left=node4;
		node2.right=node5;
		
		tree.root=new BinaryTreeNode(1);
		tree.root.left=node2;
		tree.root.right=node3;
		
		
		return tree;
	}

	public static int getHeight(BinaryTree tree) {
		return height(tree.root);
	}

	private static int height(BinaryTreeNode node) {
		
		if(node == null)
			return 0;
		
		int lHeight = height(node.left);
		int rHeight = height(node.right);
		
		int h = (lHeight < rHeight)? rHeight:lHeight;
		
		return h+1;
	}
	
	
}
