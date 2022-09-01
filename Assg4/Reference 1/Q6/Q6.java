import java.util.*;
import java.lang.*;

class Q6{
	  public static Scanner scanner = new Scanner(System.in);

	  public static  void main(String[] args){
			int n = scanner.nextInt();
			scanner.nextLine();
			HashMap<Integer,Employee> myhash = new HashMap<Integer,Employee>();
			for(int i = 0;i<n;i++){
				  String str = scanner.nextLine();
				  String[] details = str.split(" ");
				  int status = Integer.parseInt(details[0]);
				  if(status == 1){
						Employee emp = new PermanentEmployee(details[2],Integer.parseInt(details[1]),Integer.parseInt(details[3]));
						myhash.put(Integer.parseInt(details[1]),emp);
				  }else{
						Employee emp = new TemporaryEmployee(details[2],Integer.parseInt(details[1]),Integer.parseInt(details[3]),Double.parseDouble(details[4]));
						myhash.put(Integer.parseInt(details[1]),emp);
				  }
			}

			int num = scanner.nextInt();
			scanner.nextLine();
			if(myhash.containsKey(num))
				myhash.get(num).print();
			else
				System.out.println("-1");
	  }
}
