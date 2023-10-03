import java.util.*;

class BST{
  public class Node{
    private int data;
    private Node left;
    private Node right;

    Node(int val){
      this.data=val;
    }
  }
  private Node root;

  public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void insert(int val){
    root=insert (root,val);
  }
  private Node insert(Node node, int val){
    if(node==null){
      node=new Node(val);
      return node;
    }

    if( node. data > val ){
      node.left=insert (node.left,val);
    }
    
    if(node. data<val){
      node.right=insert(node.right,val);
    }

    //node.height=Math.max(height(node.left),height(node.right))+1;
    
    return node;
  }

  public void display(){
    display(root,"Root Node is: ");
  }

  private void display (Node node, String indent){
    if(node==null){
      return;
    }

    System.out.println(indent+node.data);
    display (node.left,"Left child of "+node.data+": ");
    display (node.right,"Right child of "+node.data+": ");
  }

  public void populatedSorted(int[] nums) {
    populatedSorted(nums, 0, nums.length);
  }

  private void populatedSorted(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;

    this.insert(nums[mid]);
    populatedSorted(nums, start, mid);
    populatedSorted(nums, mid + 1, end);
  }
}