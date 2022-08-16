import java.util.*;
class Q1{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your base:");
		float base = sc.nextFloat();
		System.out.print("Enter your exponent:");
		float expo = sc.nextFloat();
		System.out.println(Math.pow(base, expo));
		sc.close();
	}
}
