import java.util.*;
import java.lang.*;
class q7{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		sc.nextLine();
	        System.out.println("Enter details seperated by commas:");
		PriorityQueue<Student> pq = new PriorityQueue<Student>(n, new Comp());
		for(int i = 0; i < n; i++){
			String ip = sc.nextLine();
			String[] s = ip.split("\\,+");
			Student st = new Student(s[0], s[1],convert(s[2]), convert(s[3]));
			pq.add(st);		
		}
		System.out.println();
		for(int i = 0; i < n; i++){
			Student st = pq.remove();
			st.printdetails();
		}
	}
	public static int convert(String s){
		int ans = 0;
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9')ans = ans*10 + (s.charAt(i)-'0');
		}
		return ans;
	}

	public static class Comp implements Comparator<Student>{
		public int compare(Student s1, Student s2){
			return s1.getheight() - s2.getheight();
		}
	}

	public static class Student{
		String roll_number;
		String name;
		int height;
		int weight;
		public Student(String roll, String name, int height, int weight){
			this.roll_number = roll;
			this.name = name;
			this.height = height;
			this.weight = weight;
		}
		public int getheight(){
			return this.height;
		}
		public void printdetails(){
			System.out.println(this.roll_number+","+this.name+", "+this.height+"cm, "+this.weight+"kg ");

		}
	}
}

