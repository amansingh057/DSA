class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans = new ArrayList<Integer>();
      helper(root,ans,0);
      return ans;
    }
    void helper(Node root,ArrayList<Integer> ans,int level){
        if(root==null) return;
        if(ans.size()==level ) ans.add(root.data);
        helper(root.left,ans,level+1);
        helper(root.right,ans,level+1);
    }
}