import java.util.*;
import java.lang.*;

public class q1{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[26];
		String ip = sc.nextLine();
		for(int i = 0; i < ip.length(); i++){
			a[ip.charAt(i)- 'a']++;
		}
		for(int i = 0; i < 26; i++){
			if(i != 0 && i != 4 && i != 8 && i != 14 && i != 20){
				int num = a[i];
				while(num-- > 0){
					char ch = (char)(97+i);
					System.out.print(ch);
				}
			}
		}
	}
}
