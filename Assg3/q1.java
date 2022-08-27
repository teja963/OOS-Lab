import java.util.*;
import java.lang.*;
class q1{
	public static class Node{
		char data;
		Node next;
		Node(char data){
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes:");
		int n = sc.nextInt();
		Node head = null, tmp = null;
		
		for(int i = 0; i < n; i++){
			System.out.println("Enter the data in Node:"+(i+1));
			if(i == 0){
				head = new Node(sc.next().charAt(0));
				tmp = head;
			}
			else{
				tmp.next = new Node(sc.next().charAt(0));
				tmp = tmp.next;
			}
		}
		
		ReverseMain rmain = new ReverseMain();
		head = rmain.reverseList(head);
		System.out.println("The reversed list is:");
		display(head);
	}
	
	public static void display(Node head){
		while(head != null){
			System.out.print(head.data+"->");
			head = head.next;
		}
	}
	public static class ReverseMain{
		public static Node reverseList(Node head){
			Node curr = head, prev = null;
			while(curr != null){
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			return prev;
		}
	}
}
