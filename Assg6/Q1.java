import java.util.*;
import java.lang.*;
public class Q1{
    public static boolean check_num(String s){
        Integer i = 0;
        if(s.charAt(i) == '-')i++;
        for(; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')continue;
            else return false;
        }
        return true;
    }
    public static void display(Integer n){
        Integer ans = 0;
        for(int i = 1; i <= n; i++){
            ans += i;
        }
        System.out.println(ans);
    }
    public static void display(char ch, Integer n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void display(Integer n1, Integer n2){
        System.out.println(n1*n1+n2*n2);
    }
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] str = ip.split(" ");
        if(str.length == 1){
            display(Integer.parseInt(str[0]));
        }
        else if(str.length == 2){
            if(!check_num(str[0])){
                display(str[0].charAt(0), Integer.parseInt(str[1]));
            }
            else{
                display(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            }
        }
        sc.close();
    }
}