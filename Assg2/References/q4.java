import java.lang.*;
import java.util.*;

class q4{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String str = scanner.next();
			int n = str.length();
			if(n == 0){
				  System.out.println(0);
				  return;
			}
			boolean[][] data = new boolean[n][n];
			int max = 1;
			for(int i=0;i<n;i++){
				  data[i][i] = true;
			}

			for(int i=0;i<n-1;i++){
			    data[i][i+1] = str.charAt(i) == str.charAt(i+1);
				if(data[i][i+1]){
					  max = Math.max(max,2);
				}
			}

			for(int width = 2 ;width<n ; width++){
				  for(int j = 0;j+width < n;j++){
						data[j][j+width] = data[j+1][j+width-1] && str.charAt(j) == str.charAt(j+width);
						if(data[j][j+width])
							max = Math.max(max,width+1);
				  }
			}
			System.out.println(max);
	  }
}
