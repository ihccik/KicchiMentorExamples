package week31.algo;

import java.util.LinkedList;
import java.util.Queue;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int val) {
    this.val = val;
  }

  public static void levelOrderTraversal(TreeNode root){
    if(root == null)
      return;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){
      TreeNode toVisit = queue.poll();

      System.out.print(toVisit.val + ", ");

      if (toVisit.left != null)
        queue.add(toVisit.left);
      if (toVisit.right != null)
        queue.add(toVisit.right);
    }
  }

}
