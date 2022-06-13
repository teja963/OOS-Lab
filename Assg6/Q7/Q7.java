import java.lang.*;
import java.util.*;

class Q7{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			Garage g = new Garage();

			while(true){
			System.out.println("1.Add Vehicle");
			System.out.println("2.Display Vehicles");
			System.out.println("3.Exit");
			System.out.println();
				  System.out.print("Enter your choice:");
				  int n = scanner.nextInt();
				  scanner.nextLine();

				  if(n == 1){
						System.out.println("a.Car");
						System.out.println("b.Truck");
						System.out.print("Enter your Choice : ");
						char choice = scanner.nextLine().charAt(0);
						if(choice == 'a'){
						   System.out.print("ModelNumber: ");
						   String model = scanner.nextLine();
						   System.out.print("Rate:");	 
						   int rate = scanner.nextInt();
						   scanner.nextLine();
						   System.out.print("FuelType(petrol/diesel):");
						   String type = scanner.nextLine();
						   System.out.print("Passengers:");
						   int pass = scanner.nextInt();
						   scanner.nextLine();
						   g.addVehicle(new Car(model,type,rate,pass));
						}
				        else{
						   System.out.print("ModelNumber: ");
						   String model = scanner.nextLine();
						   System.out.print("Rate:");	 
						   int rate = scanner.nextInt();
						   scanner.nextLine();
						   System.out.print("FuelType(petrol/diesel):");
						   String type = scanner.nextLine();
						   System.out.print("LoadLimit:");
						   int pass = scanner.nextInt();
						   scanner.nextLine();
						   g.addVehicle(new Truck(model,type,rate,pass));
				         }
				  }else if(n == 2){
						g.print();
				  }else if(n ==3)
					  System.exit(1);
			}
	  }
}
