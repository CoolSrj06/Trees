import java.util.*;

class Main{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    BinaryTree bt =new BinaryTree();

    bt.createRoot(sc);
    bt.display();
  }
}