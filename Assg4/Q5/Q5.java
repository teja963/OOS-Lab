import java.util.*;
import java.lang.*;

class Q5{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			scanner.nextLine();
			Dealer[] arr = new Dealer[n];
			for(int i = 0;i<n;i++){
				  String input = scanner.nextLine();
				  String[] details = input.split(" ");
                  Car newcar = new Car(details[0],details[1],Integer.parseInt(details[2]),Integer.parseInt(details[3]));
				  arr[i] = new Dealer(details[4],Double.parseDouble(details[5]),newcar);
			}

			for(Dealer d : arr)
				d.print();
	  }
}
