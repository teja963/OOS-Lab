import java.lang.*;
import java.util.*;

class Q7{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			int n = scanner.nextInt();
			if(n ==1){
				  System.out.println("0");
				  return;
			}else if(n == 2){
				  System.out.println("0 1");
				  return;
			}
			int[] data = new int[n];
			data[0] = 0;
			data[1] = 1;
			int gar =   getfib(data,n);
			for(int i=0;i<n;i++){
				  System.out.print(data[i]+" ");
			}
			System.out.println();
			scanner.close();
	  }
	 

	  public static int  getfib(int[] data,int n){
		  if(data[n-1] != 0   || n == 1){
				return data[n-1];
		  }else{
			  data[n-1] = getfib(data,n-1) + getfib(data,n-2);
			  return data[n-1];
		  }
	  }
}
