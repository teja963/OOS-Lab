import java.lang.*;
import java.util.*;

class q1{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			ArrayList<Integer> mylist = new ArrayList<Integer>();
			String data = scanner.nextLine();
			Scanner scanf = new Scanner(data);
			while(scanf.hasNextInt()){
				  mylist.add(scanf.nextInt());
			}
			int count = 1;
			int repcount = 0;
			int start = 0;
			for(int end  =1;end<mylist.size();end++){
				  if(mylist.get(start) == mylist.get(end)){
						count++;
						if(count > 2)
							repcount++;
				  }else{
						count = 1;
						start = end;
				  }
			}
			System.out.println("The actual length is : "+mylist.size());
			System.out.println("After duplicates : "+(mylist.size()-repcount));
	  }
}
