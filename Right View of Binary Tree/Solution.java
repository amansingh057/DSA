class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer>ans = new ArrayList<>();
        helper(ans,node,0);
        return ans;
    }
    void helper(ArrayList<Integer>ans,Node node,int level){
        if(node==null )return;
        if(ans.size()==level) ans.add(node.data);
        helper(ans,node.right,level+1);
        helper(ans,node.left,level+1);
    }
}