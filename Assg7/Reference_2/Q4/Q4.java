import java.lang.*;
import java.util.*;

class Q4{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
		  String post = scanner.nextLine();
		  List<String> people = new ArrayList<String>();
		  int n = scanner.nextInt();
		  scanner.nextLine();

		  while(n > 0){
				n--;
				String  name = scanner.nextLine();
				people.add(name);
		  }

		  ElectionPost ep = new ElectionPost(post,people);
		  int size = scanner.nextInt();
		  scanner.nextLine();

		  while(size > 0){
			  String vote = scanner.nextLine();
			  ep.addVote(vote);
			  size--;
		  }
		  System.out.println(ep.getRole());
		  for(String name : people)
			  System.out.println(name);
		  ep.ascendDisplay();
		  ep.descendDisplay();
	  }
}
