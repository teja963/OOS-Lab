import java.lang.*;
import java.util.*;

class Silver extends Custmor{
	
	public Silver(String name,String acc,int balance){
		super(name,acc,balance);
	}
	
	
	public void availableBalance(){
		int balance = super.getBalance();
	    double finalbalance =  (double)balance+balance*0.05;
	    System.out.println(super.getname()+":"+balance+":"+"Silver:"+finalbalance);	
	}
}
