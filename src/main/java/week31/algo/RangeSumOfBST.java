package week31.algo;

import java.util.Stack;

public class RangeSumOfBST {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right.right = new TreeNode(18);

    int low = 7, high = 15;

    answer = 0;
    inOrderTraversal(root, low, high);
    System.out.println(answer);

    System.out.println("*****************");
    System.out.println(rangeSumBST(root, low, high));

    System.out.println("*****************");
    answer = 0;
    dfs(root,low,high);
    System.out.println(answer);
  }

  private static int answer;

  private static void inOrderTraversal(TreeNode root, int low, int high){
    if (root==null) return; // termination

    if (root.val > low)
      inOrderTraversal(root.left, low, high);

    if (root.val >= low && root.val <= high)
      answer += root.val;

    if (root.val < high)
      inOrderTraversal(root.right, low, high);
  }

  public static int rangeSumBST(TreeNode root, int low, int high) {
    int ans = 0;
    Stack<TreeNode> stack = new Stack();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      if (node != null) {
        if (low <= node.val && node.val <= high)
          ans += node.val;
        if (node.val > low)
          stack.push(node.left);
        if (node.val < high)
          stack.push(node.right);
      }
    }
    return ans;
  }

  public static void dfs(TreeNode node, int low, int high) {
    if (node != null) {
      if (low <= node.val && node.val <= high)
        answer += node.val;
      if (node.val > low)
        dfs(node.left, low, high);
      if (node.val < high)
        dfs(node.right, low, high);
    }
  }

}
