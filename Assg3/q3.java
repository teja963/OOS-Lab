import java.util.*;
import java.lang.*;

class q3{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		List<DepartmentMeetingScheduler> my_list = new ArrayList<DepartmentMeetingScheduler>();
		while(true){
			System.out.print("1. Schedule Meeting\n2. List Meetings\n\nEnter your choice: ");
			int n = sc.nextInt();
			sc.nextLine();
			if(n == 1){
				String[] str = new String[5];
				System.out.print("Title -");
				str[0] = sc.nextLine();
				System.out.print("Date -");
				str[1] = sc.nextLine();
				System.out.print("Start time -");
				str[2] = sc.nextLine();
				System.out.print("End time -");
				str[3] = sc.nextLine();
				System.out.print("Description -");
				str[4] = sc.nextLine();
				if(scheduleMeeting(str, my_list)){
					my_list.add(new DepartmentMeetingScheduler(str[0], str[1], str[2], str[3], str[4]));
					System.out.println("Scheduled successfully!!"+my_list.size());	
				}
				else{
					System.out.println("Collision! Already another meeting is scheduled\n");
				}
			}
			if(n == 2){
				ListMeetings(my_list);
			}
		}
	}
	
	public static int stringCompare(String str1, String str2)
    {
  
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
  
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
  
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
  
        if (l1 != l2)return l1 - l2;
        else return 0;
    }
	
	public static boolean scheduleMeeting(String[] str, List<DepartmentMeetingScheduler>my_list){
		  	for(DepartmentMeetingScheduler tmp: my_list){
		  		if(tmp.date.equals(str[1])){
		  			if(stringCompare(tmp.start_time, str[2]) <= 0 && stringCompare(str[2], tmp.end_time) <= 0)return false;
		  		}
		  	}
		  	return true;
	}
		
	public static void ListMeetings(List<DepartmentMeetingScheduler>my_list){
			for(DepartmentMeetingScheduler tmp: my_list){
				System.out.println("On "+tmp.date+" ,from "+tmp.start_time+" to "+tmp.end_time+": "+tmp.title+": "+tmp.description);
				System.out.println();
			}
			System.out.println();
	}
		
	public static class DepartmentMeetingScheduler{
		String title;
		String date;
		String start_time;
		String end_time;
		String description;
		
		DepartmentMeetingScheduler(String title, String date, String start_time, String end_time, String description){
			this.title = title;
			this.date = date;
			this.start_time = start_time;
			this.end_time = end_time;
			this.description = description;
		}
	}
}
