import java.util.*;
import java.lang.*;

class Q4{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = scanner.nextInt();
		scanner.nextLine();
		Custmor[] arr = new Custmor[n];
		for(int i = 0;i<n;i++){
			String input = scanner.nextLine();
			String[] details = input.split(":");
			int balance = Integer.parseInt(details[2]);
			if(balance <= 100000)
			    arr[i] = new Silver(details[0],details[1],balance);
			else if(balance <= 1000000)
			     arr[i] = new Gold(details[0],details[1],balance);
			else
			     arr[i] = new Platinum(details[0],details[1],balance);
		}
		
		for(Custmor c : arr)
		     c.availableBalance();
		
	}
}
