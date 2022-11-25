package week31.algo;

public class CalculateNodeDepthSums {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.right = new TreeNode(15);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right.right = new TreeNode(18);

    System.out.println(nodeDepthSums(root, 0));;
  }

  // Assignment  Sum of Node Depths
  public static int nodeDepthSums(TreeNode node, int A){
    if(node==null) return 0;
    System.out.println(A);
    return A+nodeDepthSums(node.left, A+1) + nodeDepthSums(node.right, A+1);
  }
}
