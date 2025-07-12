/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    List<Integer> inorder;
    int next;

    public BSTIterator(TreeNode root) {
        next=-1;
        inorder=new ArrayList<>();
        traverse(root,inorder);
    }
    
    public int next() {
        if(next+1<inorder.size()){
            next=next+1;
            return inorder.get(next);
        }
        return -1;
    }
    
    public boolean hasNext() {
        if(next+1<inorder.size()){
            return true;
        }
        return false;
        
    }

    public void traverse(TreeNode root,List<Integer> inorder) {
        if(root==null){
            return ;
        }
        traverse(root.left,inorder);
        inorder.add(root.val);
        traverse(root.right,inorder);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */