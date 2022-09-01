import java.lang.*;
import java.util.*;

class Platinum extends Custmor{
	
	public Platinum(String name,String acc,int balance){
		super(name,acc,balance);
	}
	
	
	public void availableBalance(){
		int balance = super.getBalance();
	    double finalbalance =  (double)balance+balance*0.15;
	    System.out.println(super.getname()+":"+balance+":"+"Platinum:"+finalbalance);	
	}
}
