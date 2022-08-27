import java.util.*;
import java.lang.*;

class q9{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		List<VideoStoreLauncher> my_list = new ArrayList<VideoStoreLauncher>();
		while(true){
			System.out.println("1.Add video");
			System.out.println("2.Check availability");
			System.out.println("3.Rent a video");
			System.out.println("4.Return");
			System.out.println("5.List the inventory");
			System.out.println("6.Exit");
			System.out.println();
			int n = sc.nextInt();
			switch(n){
				case 1: int num = sc.nextInt();
						System.out.println("Title:");
						sc.nextLine();
						for(int i = 0; i < num; i++){
							my_list.add(new VideoStoreLauncher(sc.nextLine()));
						}
						System.out.println();	
						break;
						
				case 2: System.out.println("Title:");
						sc.nextLine();
						String tmp = sc.nextLine();
						check_availability(my_list, tmp);
						break;
						
				case 3: System.out.println("Title:");
						sc.nextLine();
						tmp = sc.nextLine();
						rent_video(my_list, tmp);
						break;
						
				case 4: System.out.println("Title:");
						sc.nextLine();
						tmp = sc.nextLine();
						return_video(my_list, tmp);
						break;
						
				case 5: Printlist(my_list);
						break;
						
				case 6: System.exit(1);
			}
		}
	}

	public static class VideoStoreLauncher{
		String title;
		boolean rented;
		public VideoStoreLauncher(String title){
			this.title = title;
			this.rented = false;
		}
		
		public boolean isRented(){
			return this.rented;
		}
		
		public void set_rented(boolean rented){
			this.rented = rented;
		}
		
		public String get_name(){
			return this.title;
		}
	}
	
	public static void Printlist(List<VideoStoreLauncher> my_list){
		  System.out.println();
			for(VideoStoreLauncher v : my_list){
				  if(!v.isRented()){
						System.out.println(v.get_name());
				  }
			}
			System.out.println();
	 }
	  
	public static void return_video(List<VideoStoreLauncher>my_list, String tmp){
		for(VideoStoreLauncher v: my_list){
			if(v.get_name().equals(tmp)){
				v.set_rented(false);
				System.out.println();
				return;
			}
		}
	}
	
	public static void rent_video(List<VideoStoreLauncher>my_list, String tmp){
		for(VideoStoreLauncher v: my_list){
			if(v.get_name().equals(tmp)){
				v.set_rented(true);
				System.out.println();
				return;
			}
		}
	}
	
	public static void check_availability(List<VideoStoreLauncher>my_list, String tmp){
		int c = 0;
		for(VideoStoreLauncher v: my_list){
			if(v.get_name().equals(tmp)){
				c = 1;
				if(v.isRented()){
					System.out.println("Not Available");
				}
				else{
					System.out.println("Available");
				}
			}
		}
		if(c == 0)System.out.println("Not Available");
		System.out.println();
		return;
	}
}
