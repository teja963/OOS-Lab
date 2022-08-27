import java.util.*;
import java.lang.*;

class DepartmentMeetingScheduler{
	  List<Meeting> mylist;

	  public DepartmentMeetingScheduler() {
			mylist = new ArrayList<Meeting>();
	  }

	  public void print(){
			for(Meeting meet : mylist)
				meet.print();
	  }

	  public void add(Meeting meet){
			Meeting cur = meet;
			if(mylist.size() == 0){
				  System.out.println("Added");
				  mylist.add(cur);
				  return;
			}
			for(int i=0;i<mylist.size();i++){
				  Meeting runner = mylist.get(i);
				  int status = compare(cur,runner,i);
				  if(status == 1){
						continue;
				  }else if(status == 2){
						System.out.println("Collision! Already another meeting is scheduled");
						return;
				  }else{
						System.out.println("Scheduled successfully");
						return;
				  }
			}

			System.out.println("Added");
			mylist.add(cur);
			return;
	  }

      public int compare(Meeting current,Meeting runner,int pos) {
		   if(current.date < runner.date){
				mylist.add(pos,current);
				return 3;
		   }else if(current.date > runner.date){
				return 1;
		   }else{
				if(runner.startTime <= current.startTime && current.startTime < runner.endTime){
					  return 2;
				}else if(current.startTime <= runner.startTime && 
						runner.startTime < current.endTime)
					return 2;
				else if(runner.endTime < current.startTime)
					return 1;
				else{
					  mylist.add(pos,current);
					  return 3;
				}
		   }
	  }










}
