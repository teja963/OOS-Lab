import java.lang.*;
import java.util.*;
class Q4{
	public static void main(String []s){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		StringBuilder sb = new StringBuilder(""+a);
		sb.reverse();
		long ans = Integer.parseInt(sb.toString());
		System.out.println(ans);
		sc.close();
	}
}
