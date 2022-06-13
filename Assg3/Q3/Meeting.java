import java.util.*;
import java.lang.*;

class Meeting{
	  String title;
	  int  date;
	  int startTime;
	  String[] mstart = new String[2];
	  String[] mend = new String[2];
	  int endTime;
	  String description;

	  public Meeting(String title,String date,String start,String end,String des){
			this.title = title;
			String[] days = date.split("/");
			this.date = Integer.parseInt(days[0])+30*Integer.parseInt(days[1])
				+ 365 * Integer.parseInt(days[2]);
			String[] details  = start.split(":");
			mstart[0] = details[0];
			mstart[1] = details[1];
			startTime = Integer.parseInt(details[0])*60
					+Integer.parseInt(details[1]);
			details = end.split(":");
            mend[0] = details[0];
			mend[1] = details[1];
			endTime = Integer.parseInt(details[0])*60
			    	+Integer.parseInt(details[1]);
			this.description = des;
	  }

	  public void print(){
			System.out.println("On "+date+",from "+mstart[0]+"."+mstart[1]
					+" to "+mend[0]+"."+mend[1]+ " : "+title+" : "
					+description);
	  }
}
