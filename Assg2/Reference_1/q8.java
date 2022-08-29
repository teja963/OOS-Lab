import java.lang.*;
import java.util.*;

enum Type{
	  O,F,L;
}

class q8{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		  List<Train> mylist = new ArrayList<Train>();
			while(true){
				  System.out.println("1.Add details");
				  System.out.println("2.Show Details");
				  System.out.println("3.Exit");
				  System.out.println();
				  System.out.print("Enter your choice : ");
				  int n = scanner.nextInt();
				  scanner.nextLine();
				  switch(n){
						case 1:
							input(mylist);
							break;
						case 2:
							output(mylist);
							break;
						case 3:
							System.exit(1);
				  }

			}
	  }


	  public static void input(List<Train> mylist){
			System.out.println("Enter the details of the Bus");
			String str = scanner.nextLine();
			String[] details = str.split(" ");
		//	for(String s : details)
			//	System.out.println(s);
			if(details.length == 5){
				  mylist.add(new Train(Integer.parseInt(details[0]),details[1],details[2],Integer.parseInt(details[3]),Type.valueOf(details[4])));
				  System.out.println();
				  return;
			}else{
				  mylist.add(new Train(Integer.parseInt(details[0]),details[1],details[2],Integer.parseInt(details[3]),Type.valueOf("O")));
				  System.out.println();
				  return;
			}
	  }

	  public static void output(List<Train> mylist){
			System.out.println("Bus Details");
			for(Train mytrain : mylist){
				  mytrain.printDetails();
			}
			System.out.println();
	  }




	  public static class Train{
			private int busno;
			private String from;
			private String to;
			private int distance;
			private Type type;

			public Train(int busno,String from,String to,int distance,Type t){
				  this.busno = busno;
				  this.from = from;
				  this.to = to;
				  this.distance = distance;
				  this.type = t;
			}

			public void printDetails(){
				  System.out.println(this.busno+" "+from+" "+to+" "+distance+" "+type+" "+getFare());
			}

			public int  getFare(){
				  if(type == Type.O)
					  return 10*distance;
				  else if(type == Type.F)
					  return 20*distance;
				  else
					  return 24*distance;
			}

			
	  }
}
