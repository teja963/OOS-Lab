import java.util.*;
import java.lang.*;

class q3{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		IntegerArray my_list = new IntegerArray();
		String ip = sc.nextLine();
		String[] str = ip.split("\\s+");
		my_list.inputData(str);
		my_list.bubSort();
		sc.close();
	}
	
	public static class IntegerArray{
			List<Integer> my_list;
			HashMap<Integer, Integer> mp = new HashMap<>();
			public IntegerArray(){
				my_list = new ArrayList<Integer>();
			}
			
			public void inputData(String[] str){
				for(int i = 0; i < 5; i++){
					int num = Integer.parseInt(str[i]);
					my_list.add(num);
					if(mp.containsKey(num)){
						mp.put(num, mp.get(num)+1);	
					}
					else{
						mp.put(num, 1);
					}
				}
			}
			
			public void bubSort(){
				boolean check = true;
				for(Integer x: mp.keySet()){
					int num = mp.get(x);
					if(num > 1){
						System.out.println("INVALID INPUT");
						check = false;
						break;
					}
				}
				
				if(check){
					for(int i = 0; i < 5; i++){
						for(int j = i+1; j < 5; j++){
							if(my_list.get(i) > my_list.get(j)){
								int tmp1 = my_list.get(i);
								int tmp2 = my_list.get(j);
								my_list.set(i, tmp2);
								my_list.set(j, tmp1);
							}
						}
					}

					for(int i = 0; i < 5; i++){
						System.out.print(my_list.get(i)+" ");
					}
				}
			}
		}
}
