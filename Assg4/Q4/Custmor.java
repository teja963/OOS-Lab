import java.util.*;
import java.lang.*;

class Custmor{
	private String custmorName;
	private String accountNo;
	private int currentBalance;
	
	public Custmor(String name,String account,int balance){
		this.custmorName = name;
		this.accountNo = account;
		this.currentBalance = balance;
	}
	
	public void availableBalance(){
		System.out.println(this.custmorName+":"+this.currentBalance);
	}
	
	public String getname(){
		return this.custmorName;
	}
	
	public String getaccountName(){
		return this.accountNo;
	}
	
	public int getBalance(){
		return this.currentBalance;
	}
}
