import java.util.*;
import java.lang.*;

class Q3{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String str = scanner.nextLine();
            String[] details = str.split(" ");
			Rectangle obj;
			if(details.length == 1){
				  int side = Integer.parseInt(details[0]);
				  obj = new Square(side);
			}else{
				  int a = Integer.parseInt(details[0]);
				  int b = Integer.parseInt(details[1]);
				  obj = new Rectangle(a,b);
			}

			obj.getPerimeter();
			obj.getArea();
	  }
}
