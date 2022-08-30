import java.util.*;
import java.lang.*;
public class q4{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Manager, Integer> mp = new HashMap<>();
		for(int i = 0; i < n; i++){
			mp.put(new Manager(Integer.parseInt(sc.next()), sc.next(), sc.next(), Integer.parseInt(sc.next()), Integer.parseInt(sc.next())), 1);
		}
		System.out.println();
		int max_sal = 0;
		for(Manager manager: mp.keySet()){
			max_sal = Math.max(max_sal, manager.salary+manager.bonus);
		}
		System.out.println();
		for(Manager manager: mp.keySet()){
			if(max_sal == manager.salary+manager.bonus){
				System.out.println(manager.id+" "+manager.name+" "+manager.department+" "+manager.salary+" "+manager.bonus);
			}
		}
	}
	
	public static class Employee{
		int id;
		String name;
		String department;
		int salary;
	}
	
	public static class Manager extends Employee{
		int bonus;
		Manager(int id, String name, String department, int salary, int bonus){
			super.id = id;
			super.name = name;
			super.department = department;
			super.salary = salary;
			this.bonus = bonus;
		}
	}
}
