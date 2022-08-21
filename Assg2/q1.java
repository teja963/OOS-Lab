import java.util.*;
import java.lang.*;
public class q1{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> my_list = new ArrayList<Integer>();
		String input = sc.nextLine();
		Scanner read = new Scanner(input);
		while(read.hasNextInt()){
			my_list.add(read.nextInt());
		}
		for(int i = 0; i < my_list.size(); i++){
			System.out.print(my_list.get(i));
		}
	}
}
