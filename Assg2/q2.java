import java.util.*;
public class q2{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		int count = 1, i = 0;	
		if(ip.length() == 0)count = 0;
		while(i < ip.length() && ip.charAt(i) == ' ')i++;
		for(; i < ip.length(); i++){
			if(ip.charAt(i) == ' '){
				count++;
				while(i < ip.length() && ip.charAt(i) == ' ')i++;
			}
		}
		if(ip.charAt(ip.length()-1) == ' ')count--;
		System.out.println("Word count is "+count);
                for(i = 0; i < ip.length(); i++){
			char ch = ip.charAt(i);
			int num = ch;
			System.out.println(ch+" "+num);
		}
	}
}
