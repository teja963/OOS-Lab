import java.util.*;
import java.lang.*;
public class q3{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] a = new int[256];
		Arrays.fill(a, 0);
		String ans = "";
		for(int i = 0; i < str.length(); i++){
			a[str.charAt(i)]++;
		}
		for(int i = 0; i < str.length(); i++){
			int num = str.charAt(i);
			if(a[num] > 0){
				ans += str.charAt(i);
				a[num] = 0;
			}
		}
		System.out.println(ans);
	}
}
