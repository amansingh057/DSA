class Solution {
    // Function to return the diameter of a Binary Tree.
    int height(Node root) {
        // Your code here
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        if(lh>rh){
            return lh+1;
        }else{
            return rh+1;
        }
    }
    int diameter(Node root) {
        // Your code here
        if(root==null)
            return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int ld  = diameter(root.left);
        int rd  = diameter(root.right);
        
        return Math.max(lh+rh+1,Math.max(ld,rd));
    }
}
