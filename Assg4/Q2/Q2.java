import java.util.*;
import java.lang.*;


class Q2{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String input = scanner.nextLine();
			String[] details = input.split(" ");
			if(details.length == 1)
				Area(Integer.parseInt(details[0]));
			else if(details.length == 2)
				Area(Integer.parseInt(details[0]),Integer.parseInt(details[1]));
			else
				Area(Integer.parseInt(details[0]),Integer.parseInt(details[1]),
							Integer.parseInt(details[2]));
	  }

	  public static void Area(int a){
			double area = Math.PI*a*a;
			System.out.printf("Circle:%.2f\n",area);
	  }

	  public static void Area(int a,int b){
			double area = (double)a*b;
			System.out.printf("Rectangle:%.2f\n",area);
	  }

	  public static void Area(int a,int b,int c){
			double s = ((double)(a+b+c))/2;
			double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			System.out.printf("Triangle:%.2f\n",area);
	  }
}
