import java.lang.*;
import java.util.*;

class Q3{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String str = scanner.nextLine();
			if(str.equals("Circle")){
				  Circle circle = new Circle();
				  circle.area(scanner.nextInt());
			}else{
				  Square square = new Square();
				  square.area(scanner.nextInt());
			}
	  }
}
