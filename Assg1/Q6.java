import java.util.*;
class Q6{
	public static void main(String []s){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		StringBuilder ans = new StringBuilder(""+n);
		ans.reverse();
		int n1 = Integer.parseInt(ans.toString());
		System.out.println(n == n1);
		sc.close();
	}
}

