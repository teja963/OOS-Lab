import java.util.*;
import java.lang.*;

class q2{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the available inventory items line by line, type OKAY at the end of the list:");
		Stock stk = new Stock();
		while(true){
			String ip = sc.nextLine();
			String[] str = ip.split("\\s+");
			if(str.length == 1)break;
			int id = Integer.parseInt(str[0]);
			int price = Integer.parseInt(str[2]);
			stk.add(new Item(id, str[1], price));
		}
		
		while(true){
			System.out.println("\n1.Add Invoice\n2.Exit\nChoice:");
			int opt = sc.nextInt();
			if(opt == 2)System.exit(1);
			else if(opt == 1){
				HashMap<Integer, Integer> mp = new HashMap<>();
				System.out.println("Add Invoice Item(Y/N)");
				String tmp = sc.next();
				sc.nextLine();
				System.out.println("Enter Inventory ID and Quantity line by line, type OKAY at the end of the list");
				while(true){
					String tmp_1 = sc.nextLine();
					String[] ip = tmp_1.split("\\s+");
					if(ip.length == 1)break;
					else{
						int id = Integer.parseInt(ip[0]);
						int quantity = Integer.parseInt(ip[1]);
						mp.put(id, quantity);
					}
				}
				System.out.println("***INVOICE***");
				int cost = 0;
				for(Integer x: mp.keySet()){
					int quantity = mp.get(x);
					if(stk.check(x)){
						Item item = stk.getId(x);
						System.out.println(item.id+","+item.name+","+item.price+","+quantity);
						cost += item.price*quantity;
					}
				}
				System.out.println("Total:"+cost);
			}
		}
	}
	
	public static class Stock{
		HashMap<Integer, Item>mp = new HashMap<>();
		public void add(Item item){
			mp.put(item.id, item);
		}
		
		public boolean check(int id){
			if(mp.containsKey(id))return true;
			else return false;
		}
		
		public Item getId(int id){
			return mp.get(id);
		}
	}
	
	public static class Item{
		int id;
		String name;
		int price;
		Item(int id, String name, int price){
			this.id = id;
			this.name = name;
			this.price = price;
		}
	}
}
