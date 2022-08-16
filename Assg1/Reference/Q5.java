import java.lang.*;
import java.util.*;

class Q5{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			System.out.print("Size of the array,N=");
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				  arr[i] = scanner.nextInt();
			}
		    mergesort(arr,0,n-1);
			for(int i=0;i<n;i++){
				  System.out.print(arr[i]+" ");
			}
			System.out.println();
			scanner.close();
	  }

	  public static void mergesort(int[] arr,int l,int h){
			if(l < h){
				  int m = l + (h-l)/2;
				  mergesort(arr,l,m);
				  mergesort(arr,m+1,h);
				  merge(arr,l,m,h);
			}

	  }

	  public static void merge(int[] arr,int l,int m,int h){
			int n1 = m-l+1;
			int n2 = h-m;

			int[] arr1 = new int[n1];
			int[] arr2 = new int[n2];


			for(int i=0;i<n1;i++){
				  arr1[i] = arr[l+i];
			}
			for(int i = 0;i<n2;i++){
				  arr2[i] = arr[m+1+i];
			}

			int runner = l;
			int runner1 = 0;
			int runner2 = 0;
            while(runner1 != n1 && runner2 != n2){
				  if(arr1[runner1] > arr2[runner2]){
					arr[runner] = arr1[runner1];
					 runner++;
					 runner1++;
				  }else{
						arr[runner] = arr2[runner2];
						runner++;
						runner2++;
				  }
			}

			while(runner1 != n1){
				  arr[runner] = arr1[runner1];
				  runner++;
				  runner1++;
			}

			while(runner2 != n2){
				  arr[runner] = arr2[runner2];
				  runner++;
				  runner2++;
			}
	  }


}
