import java.lang.*;
import java.util.*;

class ReverseMain{
	  public static void reverseList(LinkedList L){
			LinkedList.Node prev = null;
			LinkedList.Node cur = L.getroot();
			LinkedList.Node next = null;
			while(cur != null){
				  next = cur.next;
				  cur.next = prev;
				  prev = cur;
				  cur = next;
			}
			L.setroot(prev);
			return;
	  }
}
