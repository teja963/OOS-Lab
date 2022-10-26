import java.lang.*;
import java.util.*;

class Q2{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			Flipkart fp = new Flipkart();
			while(true){
				  String str = scanner.nextLine();
				  String[] in = str.split(" ");
				  if(str.equals(""))
					  break;
				  if(in[0] == "HDFC")
					  fp.gethdfc(Integer.parseInt(in[1]),Integer.parseInt(in[2]));
				  else
					fp.geticici(Integer.parseInt(in[1]),Integer.parseInt(in[2]));
			}
	  }
}
