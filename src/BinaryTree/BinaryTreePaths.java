package BinaryTree;
import java.util.List;
import java.util.ArrayList;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class BinaryTreePaths {
    public void helper (TreeNode root, List<String> ans,String s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s+=root.val;
            ans.add(s);
            return;
        }
        helper(root.left, ans,s+root.val+"->");
        helper(root.right,ans,s+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        helper(root,ans,"");
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3)
        );

        BinaryTreePaths btp = new BinaryTreePaths();
        System.out.println(btp.binaryTreePaths(root));
    }

}
