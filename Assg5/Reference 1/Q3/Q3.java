import java.lang.*;
import java.util.*;

class Q3{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			scanner.nextLine();
			HashMap<Integer,Student> myhash = new HashMap<>();
			for(int i = 0;i<n;i++){
				  String input = scanner.nextLine();
				  StringBuilder sb = new StringBuilder(input);
				  sb.deleteCharAt(sb.length()-1);
				  sb.deleteCharAt(0);
				  String[] details = sb.toString().split(",");
				  int height = Integer.parseInt(details[2]);
				  if(myhash.containsKey(height)){
				          String name = details[0];
						  if(name.compareTo(myhash.get(height).getname()) > 0)
							  continue;
						  else{
							  int roll = Integer.parseInt(details[1]);
							  Student stu = new Student(name,roll,height);
							  myhash.put(height,stu);
						  }
				  }else{
						myhash.put(height,new Student(details[0],Integer.parseInt(details[1]),height));

				  }
			}
            System.out.println(myhash.keySet().size());
			for(Student stu : myhash.values()){
				  System.out.print(stu.getname()+" ");
			}
			System.out.println();

	  }
}
