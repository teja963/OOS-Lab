import java.lang.*;
import java.util.*;


class q6{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			Library lib = new Library();
				  System.out.println("1.Add Reference Book");
				  System.out.println("2.Add Text Book");
				  System.out.println("3.Check-Out");
				  System.out.println("4.Check-in");
				  System.out.println("5.List Books");
				  System.out.println("6.Exit");
			while(true){
                  System.out.println();
				  System.out.print("Enter your choice :");
				  int n = scanner.nextInt();
				  scanner.nextLine();

				  if(n == 1){
						System.out.println("Enter ID, Title and Author (Line by line)" );
						int id = scanner.nextInt();
						scanner.nextLine();

						String title = scanner.nextLine();
						String author = scanner.nextLine();
						lib.addReferanceBook(new ReferanceBooks(title,author,id));
				  }else if(n == 2){
						
						System.out.println("Enter ID, Title and Author (Line by line)" );
						int id = scanner.nextInt();
						scanner.nextLine();

						String title = scanner.nextLine();
						String author = scanner.nextLine();
						lib.addTextBook(new TextBooks(title,author,id));
				  }else if(n == 3){
					    System.out.print("Enter the Book Id :");
						int id = scanner.nextInt();
						scanner.nextLine();
                        lib.checkOut(id);
                           
				  }else if(n == 4){
						int id = scanner.nextInt();
						scanner.nextLine();
						lib.checkIn(id);
				  }else if(n == 5){
						lib.ListBooks();
				  }else if(n == 6){
						System.exit(1);
				  }
			}
	  }
}
