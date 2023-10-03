class ALV{
  class Node {
    int val;
    Node left;
    Node right;

    public Node(int val){
      this.val=val;
    }

    private Node root;
    public void insert(int val){
      root=insert(root,val);
    }
    private Node insert(Node node,int val){
      if(node == null){
        return node;
      }

      if(node.val>val){
        node.left=new Node(val);
      }

      if(node.val<val){
        node.left=new Node(val);
      }

      return rotate(node);
    }

    
  }
}