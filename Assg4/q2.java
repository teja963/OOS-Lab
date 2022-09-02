import java.util.*;
import java.lang.*;

class q2{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> my_list = new ArrayList<Integer>();
		String ip = sc.nextLine();
		String[] str = ip.split("\\s+");
		for(int i = 0; i < str.length; i++){
			int num = Integer.parseInt(str[i]);
			my_list.add(num);
			set.add(num);
		}
		
		int ans = 0;
		for(int i = 0; i < my_list.size(); i++){
			for(int j = i+1; j < my_list.size(); j++){
				int sum = my_list.get(i)+my_list.get(j);
				if(set.contains(sum))ans++;
			}
		}
	
		System.out.println(ans);
		sc.close();
		System.exit(1);
	}
}
