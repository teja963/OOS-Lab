import java.lang.*;
import java.util.*;

class ElectionPost implements SortVotes{
	  private String NameOfThePost;
	  HashMap<String,Integer> myhash;

	  public ElectionPost(String role,List<String> names){
		  this.NameOfThePost = role;
		  myhash = new HashMap<String,Integer>();
		  for(String str : names)
			  myhash.put(str,0);
			
	  }

	  public String getRole(){
			return this.NameOfThePost;
	  }

	  public void addVote(String name){
			myhash.put(name,myhash.get(name)+1);
	  }

	  public void ascendDisplay(){
			PriorityQueue<String> pq = new PriorityQueue<String>((a,b)->myhash.get(a) - myhash.get(b));
			for(String name : myhash.keySet())
				pq.add(name);
			while(pq.size() != 0){
				  String name = pq.remove();
				  System.out.println(name+" - "+myhash.get(name));
			}
	  }

	  public void descendDisplay(){
			PriorityQueue<String> pq = new PriorityQueue<String>((a,b)->myhash.get(b)-myhash.get(a));
			for(String name : myhash.keySet())
				pq.add(name);
			while(pq.size() != 0){
				  String name = pq.remove();
				  System.out.println(name+" - "+myhash.get(name));
			}
	  }


}
