import java.lang.*;
import java.util.*;

class TextBooks extends Book{
	 Scanner scanner = new Scanner(System.in);
	 String status;
	 String borrowedUser;
	  public TextBooks(String title,String author,int id){
			super(title,author,id);
			status = "AVAILABLE";
			borrowedUser = "NONE";
	  }

	  public void print(){
			System.out.print("TextBOOK:");
			super.print();
			System.out.println(":"+status);
	  }

	  public void checkOut(){
			if(status.equals("AVAILABLE")){
				 System.out.print("Enter Username ");
				 String name = scanner.nextLine();
				 borrowedUser = name;
				 status = "Borrowed by "+name;
			}else{
				  System.out.println(status);
			}
	  }

	  public void checkIn(){
			status = "AVAILABLE";
			borrowedUser = "NONE";
	  }
}
