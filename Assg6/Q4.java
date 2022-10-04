import java.util.*;
import java.lang.*;
public class Q4{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            String ip = sc.nextLine();
            String[] str = ip.split(" ");
            if(str.length == 2){
                IntegerAddition obj = new IntegerAddition(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
                System.out.println(obj.Add());
            }
            else if(str.length == 4){
                FractionAddition obj = new FractionAddition(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
                System.out.println(obj.Add());
            }
        }
        sc.close();
    }
}
abstract class Addition{
    public abstract String Add();
}
class IntegerAddition extends Addition{
    private int n1;
    private int n2;
    public IntegerAddition(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public String Add(){
        return Integer.toString(this.n1+this.n2);
    }
}
class FractionAddition extends Addition{
    private int n1;
    private int d1;
    private int n2;
    private int d2;
    public FractionAddition(int n1, int n2, int n3, int n4){
        this.n1 = n1;
        this.d1 = n2;
        this.n2 = n3;
        this.d2 = n4;
    }
    public int hcf(Integer n1, Integer n2){
        Integer ans = 0;
        for(int i = 1; i <= Math.max(n1, n2); i++){
            if(n1 % i == 0 && n2 % i == 0)ans = i;
        }
        return ans;
    }
    public String Add(){
        Integer val = hcf(this.n1*this.d2+this.n2*this.d1, this.d1*this.d2);
        Integer num = ((this.n1*this.d2+this.n2*this.d1)/ val);
        Integer deno = ((this.d1*this.d2) / val);
        String ans = Integer.toString(num);
        ans += " / ";
        ans += Integer.toString(deno);
        return ans;
    }
}