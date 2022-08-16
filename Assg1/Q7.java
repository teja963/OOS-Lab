import java.util.*;
class Q7{
	public static void main(String []s){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a >= 1)System.out.print("0");
		if(a >= 2)System.out.print(" 1");
		if(a >= 3)
		{
			long f1 = 0, f2 = 1;
			for(int i = 0; i < a-2; i++)
			{
				long f3 = f1 + f2;
				System.out.print(" "+f3);
				f1 = f2;
				f2 = f3;
			}		
		}
	}
}
