import java.util.*;
import java.lang.*;
public class q4{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		int[][] dp = new int[n+1][n+1];
	        int ans = 1;	
		for(int i = 0; i < n; i++){
			dp[i][i] = 1;
		}
		for(int i = 0; i < n-1; i++){
			if(str.charAt(i) == str.charAt(i+1)){
				dp[i][i+1] = 1;
				ans = 2;
			}
		}
		for(int i = 3; i <= n; i++){
			for(int j = 0; j <= (n-i); j++){
				int end = j+i-1;
				if(str.charAt(j) == str.charAt(end) && dp[j+1][end-1] == 1){
					dp[j][end] = 1;
					ans = i;
				}
			}
		}
		System.out.println(ans);	
	}
}
