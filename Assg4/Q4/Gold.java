import java.lang.*;
import java.util.*;

class Gold extends Custmor{
	
	public Gold(String name,String acc,int balance){
		super(name,acc,balance);
	}
	
	
	public void availableBalance(){
		int balance = super.getBalance();
	    double finalbalance =  (double)balance+balance*0.1;
	    System.out.println(super.getname()+":"+balance+":"+"Gold:"+finalbalance);	
	}
}
