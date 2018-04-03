/* 226. Invert Binary Tree
Invert a binary tree.
     4
   /   \
  2     7
 / \   / \
1   3 6   9

to

     4
   /   \
  7     2
 / \   / \
9   6 3   1
*/
public class Invert_Binary_Tree{

    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }
    
    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        if(root.left != null && root.right != null)
            System.out.println("swap"+root.left.val+","+root.right.val);
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
    
     public static void main(String []args){
        TreeNode root= new TreeNode(4);
        root.left= new TreeNode(7);
        root.right= new TreeNode(2);
        root.left.left= new TreeNode(9);
        root.left.right= new TreeNode(6);
        root.right.left= new TreeNode(3);
        root.right.right= new TreeNode(1);
        invertTree(root);
     }
}
