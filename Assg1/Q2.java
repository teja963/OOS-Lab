import java.util.*;
class Q2
{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		float a = sc.nextFloat();
		System.out.print("b = ");
		float b = sc.nextFloat();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		sc.close();
	}
}

