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

    System.out.println(rangeSumBST(root,7,15));

    answer = 0;
    dfs(root,7,15);
    System.out.println(answer);
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

  private static int answer;

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
