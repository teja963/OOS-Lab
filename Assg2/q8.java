import java.util.*;
import java.lang.*;
class q8{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		ArrayList<Train> my_list = new ArrayList<Train>();
		while(true){
			System.out.print("1-Add details\n2-Show details\n3-Exit\n");
			int num = sc.nextInt();
			sc.nextLine();
			if(num == 1){
				String ip = sc.nextLine();
				String[] s = ip.split("\\s+");
				String tmp = "";
				if(s.length == 5)tmp = s[4];
				my_list.add(new Train(Integer.parseInt(s[0]), s[1], s[2], convert(s[3]), tmp.length() > 0? tmp.charAt(0): 'O'));
			}
			else if(num == 2){
				for(Train x: my_list)x.display();
			}
			else if(num == 3)break;
		}
	}

	public static double convert(String s){
		double ans = 0.0;
		for(int i = 0; i < s.length(); i++){
			ans = ans*10 + (s.charAt(i)-'0');
		}
		return ans;
	}

	public static class Train{
		int busno;
		String from;
		String to;
		double distance;
		char type;
		public Train(int num, String from, String to, double distance, char type){
			this.busno = num;
			this.from = from;
			this.to = to;
			this.distance = distance;
			this.type = type;
		}

		public double CalcFare(char type, double distance){
			if(type == 'O')return 10*distance;
			else if(type == 'F')return 20*distance;
			return 24*distance;
		}

		public void display(){
			System.out.println(this.busno+" "+this.from+" "+this.to+" "+this.distance+" "+this.type);
		}	
	}
}
