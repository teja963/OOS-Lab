import java.util.*;
import java.lang.*;
public class q5{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String[] str = ip.split("\\s+");
	       	int days = sc.nextInt();
		boolean extra = false;
		if(str[1].equals("employee"))extra = true;
		double amount = 0.0;
		if(str[2].equals("veg")){
			amount += days*100;
			if(extra)amount += (amount * 0.05);
		}
		else if(str[2].equals("nonveg")){
			amount += days*120;
			if(extra)amount += (amount * 0.05);
		}
		System.out.println(amount);	
	}
}
