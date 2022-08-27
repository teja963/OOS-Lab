import java.util.*;
import java.lang.*;


class Q2{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		  System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
		  Stock  stock  = new Stock();
		  while(true){
				String str = scanner.nextLine();
				String[] details = str.split(" ");
				if(details.length == 1)
					break;
				int id = Integer.parseInt(details[0]);
				int cost = Integer.parseInt(details[2]);
				stock.add(new Item(id,details[1],cost));
           
		  }


		  while(true){
			    System.out.println();
				System.out.println("1.Add Invoice");
				System.out.println("2.Exit");
				System.out.println("Choice:");
				int n = scanner.nextInt();
				scanner.nextLine();
				if(n == 2)
					System.exit(1);
				else{
					Investory kart = new Investory();
					while(true){
						  String s = scanner.nextLine();
						 // scanner.nextLine();
						  String[] details = s.split(" ");
						  if(details.length == 1){
								kart.invoice();
								break;
						  }else{
								int id = Integer.parseInt(details[0]);
								int no  = Integer.parseInt(details[1]);
                                kart.add(stock.getItem(id),no);
						  }
					}
					  
				}
				  

				
		  }
	  }
}
