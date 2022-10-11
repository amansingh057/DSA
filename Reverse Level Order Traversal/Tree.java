class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        Queue <Node>qu = new LinkedList<Node>();
        Stack<Node> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        qu.add(node);
        while(!qu.isEmpty()){
            Node top = qu.remove();
            st.push(top);
            if(top.right!=null){
                qu.add(top.right);
            }
            if(top.left!=null){
                qu.add(top.left);
            }
        }
        while(st.size()!=0){
            Node rem = st.pop();
            arr.add(rem.data);
        }
        return arr;
       
    }
} 