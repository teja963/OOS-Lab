import java.lang.*;
import java.util.*;

class Q1{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		   System.out.print("Enter the number of node : ");
		   int n = scanner.nextInt();
		   LinkedList L = new LinkedList();
		   for(int i=0;i<n;i++){
				System.out.print("Enter the data in Node"+(i+1)+" : ");
				char c = scanner.next().charAt(0);
				L.insert(c);
		   }
		   L.printList();
		   ReverseMain.reverseList(L);
		   L.printList();
				
			  
		   
	  }
}
