import java.lang.*;
import java.util.*;

class Q6{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		    Queue q = new Queue();
			while(true){
				  String in = scanner.nextLine();
                  if(in.equals(""))
					  break;
				  String[] str = in.split(" ");

				  if(str[0].equals("E")){
						q.enqueue(Integer.parseInt(str[1]));
				  }else{
						q.dequeue();
				  }
			}
	  }
}
