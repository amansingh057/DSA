import java.util.*;
class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null){
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        if(lh>rh){
            return lh+1;
        }else{
            return rh+1;
        }
        // return height(node.left)+height(node.right)+1;
    }
}
