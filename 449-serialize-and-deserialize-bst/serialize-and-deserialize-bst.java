/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        helperSerialize(root,sb);
        return sb.toString();   
    }
    void helperSerialize(TreeNode root,StringBuilder sb){
        if(root==null){
            return ;
        }
        sb.append(String.valueOf(root.val)).append(",");
        helperSerialize(root.left,sb);
        helperSerialize(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")){
            return null;
        }
        String[] str=data.split(",");
        Queue<String> queue=new LinkedList<>(Arrays.asList(str));
        return helperDeserialize(queue,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    TreeNode helperDeserialize(Queue<String> queue,int l,int h){
        if(queue.isEmpty()){
            return null;
        }
        int value=Integer.parseInt(queue.peek());
        if(value<l || value>h){
            return null;
        }
        queue.poll();
        TreeNode root = new TreeNode(value);
        root.left = helperDeserialize(queue, l, value);
        root.right = helperDeserialize(queue, value, h);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;