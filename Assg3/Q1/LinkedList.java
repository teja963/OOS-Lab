import java.util.*;
import java.lang.*;

class LinkedList{
      private  Node root;


	  public void  setroot(Node root){
			this.root = root;
	  }

	  public void insert(char data){
			if(root == null){
				  root = new Node(data);
				  return;
			}
			Node runner = root;
			while(runner.next != null)
				runner = runner.next;
			runner.next = new Node(data);
	  }
	  public Node getroot(){
			return root;
	  }

	  public void printList(){
		    if(root == null)
				return;
			Node runner = root;
			System.out.print(runner.data);
			runner  = runner.next;
			while(runner != null){
				  System.out.print("->"+runner.data);
				  runner = runner.next;
			}
			System.out.println();
	  }



     public class Node{
		  char data;
		  Node next;
		  public Node(char data){
				this.data = data;
				next = null;
		  }
	 }




}
