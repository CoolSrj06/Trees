import java.util.*;

class BinaryTree {
  
  public BinaryTree(){}
  
  private static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
      this.data=data;
    }
  }
  
  private Node root;
  
  public void createRoot(Scanner sc){
    System.out.println("Enter the root value of tree");
    int val=sc.nextInt();
    root=new Node(val);
    branch(sc,root);
  }

  public void branch(Scanner sc,Node node){
    System.out.println("Do you want to insert element on the left of "+node.data +" True/False");
    boolean left =sc.nextBoolean();
    if(left){
      System.out.println("Enter the value that you want to insert on the left of "+node.data);
      int val =sc.nextInt();
      node.left=new Node(val);
      branch(sc,node.left);
    }

    System.out.println("Do you want to insert element on the right of "+node.data+" True/False");
    boolean right=sc.nextBoolean();
    if(right){
      System.out.println("Enter the value that you want to insert on the right of "+node.data);
      int val=sc.nextInt();
      node.right=new Node(val);
      branch(sc,node.right);
    }
  }

  public void display(){
    display (this.root,"");
  }
  private void display(Node node, String intend){
    if(node==null){
      return;
    }
    System.out.println(intend+node.data);
    display(node.left,intend+"\t");
    display(node.right,intend+"\t");
  }

  /**public void prettyDisplay(){
    prettyDisplay(this.root,"");
  }

  private void prettyDisplay(Node node,String intend){
    if(node==null){
      return;
    }
    prettyDisplay(node.left,intend+"\t");
  }**/
}