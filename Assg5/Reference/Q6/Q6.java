import java.lang.*;
import java.util.*;

class Q6{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			System.out.println("Enter Customer Details:");
			System.out.print("Name:");
			String name = scanner.nextLine();
			System.out.print("Mobile:");
			String mobile = scanner.nextLine();	
			System.out.print("MemberShip:");
			String mem = scanner.nextLine();
            System.out.println();

			Customers current;
			if(mem.equals("Gold")){
				  current = new Gold(name,mobile);
			}else if(mem.equals("Premium")){
				  current = new Premium(name,mobile);
			}else if(mem.equals("Silver")){
				  current = new Silver(name,mobile);
			}else{
				  current = new Customers(name,mobile);
			}

			while(true){
				  System.out.print("Add Service(Y/N) :");
				  char choice = scanner.nextLine().charAt(0);
				  if(choice == 'N')
					  break;
				  else if(choice == 'Y') {
					  System.out.print("ServiceName:");
					  String itemname = scanner.nextLine();
					  System.out.print("Rate:");
					  int num = scanner.nextInt();
					  scanner.nextLine();
					  Item newitem = new Item(itemname,num);
					  current.addItem(newitem);
                      System.out.println();
				  }else{
						continue;
				  }

			}

			current.invoice();

	  }
}
