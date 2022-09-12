import java.util.*;
import java.lang.*;
public class Q1{
    public static void bitwise_and(Integer a, Integer b){
        System.out.println(a&b);
    }

    public static void bitwise_and(Integer a, Integer b, Integer c){
        System.out.println(a&b&c);
    }

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] str = ip.split("\\s+");
        if(str.length == 2){
            bitwise_and(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        }
        else if(str.length == 3){
            bitwise_and(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
        }
        sc.close();
    }
}