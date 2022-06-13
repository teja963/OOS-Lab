import java.io.*;
import java.util.*;

class Compute{
    private int s;
    private char ch;
    private float  f;
    private int n;
  //  private status  = 0;
    
    public Compute(int s,int n){
      //  int status = 1;
        this.s = s;
        this.n = n;
        if(s < 0){
            System.out.println("INVALID");
        }else{
            double ss = (double)s;
            double nn = (double)n;
            double ans = Math.pow(ss,nn);
            int finalans = (int)ans;
            System.out.println(finalans);
        }
    }
    
    public Compute(int s,char ch){
        //int status = 2;
        this.ch = ch;
        this.s = s;
        if(s > 10){
            System.out.println("OVERFLOW");
        }else{
            System.out.println(retstring(s,ch));
        }
    }
    
    public Compute(int s,float f){
        this.s = s;
        this.f = f;
        if(f < 0)
            System.out.println(0);
        else{
            double temp = (double)s;
            double ff = (double)f;
            double ans = Math.ceil(temp*ff);
            int result = (int)ans;
            System.out.println(result);
        }
    }
    
    public String retstring(int s,char ch){
        StringBuilder sb = new StringBuilder();
        for(int i= 0;i<s;i++)
            sb.append(ch);
        return sb.toString();
    }
    
}

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int s = scanner.nextInt();
        scanner.nextLine();
        String n = scanner.nextLine();
        if(Character.isAlphabetic(n.charAt(0))){
            Compute c = new Compute(s,n.charAt(0));
        }else{
            boolean isfloat = false;
            for(int i = 0;i<n.length();i++){
                if(n.charAt(i) == '.'){
                    isfloat = true;
                    break;
                }
            }
            if(isfloat){
                Compute c = new Compute(s,Float.parseFloat(n));
            }else{
                Compute c = new Compute(s,Integer.parseInt(n));
            }
        }
    }
}
