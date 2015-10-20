// FLATTEN A BINARY TREE TO A SINGLY LINKED LIST - PRE-ORDER FASHION.. NEXT NODE = RIGHT NODE

import java.io.*;
import java.util.*;

class Solution {
  private static TreeNode prev = null;
  
  public static void main(String[] args) {
    // Step-1: Inputs
    TreeNode root = new TreeNode (1);
    root.left = new TreeNode (2);
    root.right = new TreeNode (5);
    root.left.left = new TreeNode (3);
    root.left.right = new TreeNode (4);
    root.right.right = new TreeNode (6);
    
    // Step-2: Flatten subroutine
    flatten (root);
    
    // Step-3: printing results
    do {
      System.out.print (root.value + "-");
      root = root.right;
    } while (root != null);
  }
  
  // CORE METHOD TO FLATTEN A BINARY TREE TO LINKED-LIST
  public static void flatten (TreeNode root) {
    if (root == null)
      return;
    flatten (root.right);
    flatten (root.left);
    root.right = prev;
    root.left = null;
    prev = root;
  }
}

class TreeNode {
  int value;
  TreeNode left;
  TreeNode right;
  public TreeNode (int value) {
    this.value = value;
  }
}
