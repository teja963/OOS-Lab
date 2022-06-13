import java.lang.*;
import java.util.*;

class Q3{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void  main(String[] args){
		 DepartmentMeetingScheduler time = new DepartmentMeetingScheduler();
		 while(true){
			  System.out.println();
			  System.out.println("1.Schedule Meeting");
			  System.out.println("2.List Meeting");
			  System.out.println();
			  System.out.print("Enter the choice : ");
			  int n = scanner.nextInt();
			  scanner.nextLine();
			  if(n == 1){
					System.out.print("Title : ");
					String title = scanner.nextLine();
					System.out.print("Date : ");
					String date = scanner.nextLine();
					System.out.print("Start Time - ");
					String start = scanner.nextLine();
					System.out.print("End Time - ");
					String end = scanner.nextLine();
					System.out.print("Description - ");
					String des = scanner.nextLine();
                    time.add(new Meeting(title,date,start,end,des));
			  }else if(n == 2){
					time.print();
			  }
		 }
	  }
}
