import java.lang.*;
import java.util.*;

class Q5{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		  String[] str = scanner.nextLine().split(" ");
	         int x = Integer.parseInt(str[0]);
			 int y = Integer.parseInt(str[1]);

			// int[][] board = new int[8][8];
			 int n = scanner.nextInt();
			 scanner.nextLine();

			 try{
				  for(int i = 0;i<n;i++){
						String[] mov = scanner.nextLine().split(" ");
			            int times = Integer.parseInt(mov[1]);
						if(mov[0].equals("Up"))
							x = x - times;
						else if(mov[0].equals("Down"))
							x = x + times;
						else if(mov[0].equals("Right"))
							y = y + times;
						else if(mov[0].equals("Left"))
							y = y - times;

				  }
						if(1 > x || x > 8)
							throw new Exception("Out of Bounds");
						if(1 > y || y > 8)
							throw new Exception("Out of Bounds");
             System.out.println(x+" "+y);

			 }

			 catch(Exception e){
				  System.out.println(e);
			 }

	  }

	  public static  int getint(){
			int num = scanner.nextInt();
			scanner.nextLine();
			return num;
	  }

	


}
