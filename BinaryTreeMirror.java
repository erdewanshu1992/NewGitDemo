package com.javaBasicClasses;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreeMirror {

    // Function to convert a binary tree into its mirror
    public static void convertToMirror(TreeNode root) {
        if (root == null) return;

        // Swap left and right subtrees
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively convert left and right subtrees
        convertToMirror(root.left);
        convertToMirror(root.right);
    }

    // Function to print the tree in inorder traversal
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Print original tree
        System.out.println("Original tree:");
        inorder(root);
        System.out.println();

        // Convert to mirror
        convertToMirror(root);

        // Print mirror tree
        System.out.println("Mirror tree:");
        inorder(root);
    }
}

