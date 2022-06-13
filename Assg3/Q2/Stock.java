import java.util.*;
import java.lang.*;

class Stock{
	  HashMap<Integer,Item> myhash = new HashMap<>();
	  public void add(Item item){
			myhash.put(item.id,item);
	  }

	  public boolean haveStock(int id){
			if(myhash.containsKey(id))
				return true;
			else
				return false;
	  }

	  public Item getItem(int id){
			if(haveStock(id)){
				Item cur = myhash.get(id);
				Item ret = new Item(cur.id,cur.name,cur.cost);
				return ret;
			}
			return null;
	  }
}
