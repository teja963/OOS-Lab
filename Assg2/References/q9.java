import java.lang.*;
import java.util.*;

class q9{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			List<Video> mylist = new ArrayList<Video>();
			while(true){
				  System.out.println("1.Add video");
				  System.out.println("2.Check availbility");
				  System.out.println("3.Rent a video");
				  System.out.println("4.Return");
				  System.out.println("5.List the inventory");
				  System.out.println("6.Exit");
				  System.out.println();
				  System.out.print("Choice:");
				  int n = scanner.nextInt();
				  scanner.nextLine();
				  switch(n){
						case 1:
							int k = scanner.nextInt();
							scanner.nextLine();
							for(int i=0;i<k;i++)
						    	mylist.add(new Video(scanner.nextLine()));
							System.out.println();
							break;
						case 2:
							checkavail(mylist);
							break;
						case 3:
							rentVideo(mylist);
							break;
						case 4:
							returnVideo(mylist);
							break;
						case 5:
							Printlist(mylist);
							break;
						case 6:
							System.exit(1);
				  }
			}
	  }

	  public static void Printlist(List<Video> mylist){
		  System.out.println();
			for(Video v : mylist){
				  if(!v.isRented()){
						System.out.println(v.getname());
				  }
			}
			System.out.println();
	  }

	  public static void returnVideo(List<Video> mylist){
			System.out.println();
			System.out.println("Title :");
			String title = scanner.nextLine();
			for(Video v : mylist){
				  if(v.getname().equals(title)){
						v.setrented(false);
						System.out.println();
						return;
				  }
			}
	  }

	  public static void rentVideo(List<Video> mylist){
			System.out.println();
			System.out.println("Title :");
            String title = scanner.nextLine();
			for(Video v : mylist){
				  if(v.getname().equals(title)){
					  v.setrented(true);
					  System.out.println();
					  return;
				  }
			}
	  }

	  public static void checkavail(List<Video> mylist){
			System.out.println();
			System.out.println("Title:");
			String s = scanner.nextLine();
			for(Video v : mylist){
				  if(v.getname().equals(s)){
						if(v.isRented()){
							System.out.println("NotAvailable");
							System.out.println();
							return;
						}else{
							  System.out.println("Available");
							  System.out.println();
							  return;
						}
				  }
			}

	  }
	  


public static   class Video{
		  private String name;
		  private boolean rented;

		  public Video(String name){
				this.name = name;
				this.rented = false;
		  }

		  public boolean isRented(){
				return this.rented;
		  }

		  public void setrented(boolean rent){
				this.rented = rent;
		  }

		  public String getname(){
				return this.name;
		  }
	 }
}
