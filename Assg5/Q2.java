import java.util.*;
import java.lang.*;
class Q2{
    public static void area_circle(Integer a){
        System.out.printf("Circle:%.2f", Math.PI * a * a);
    }
    public static void area_rectangle(Integer a, Integer b){
        System.out.printf("Rectangle:%.2f", (double)a * b);
    }
    public static void area_triangle(Integer a, Integer b, Integer c){ 
        double sqr_a = Math.pow(a, 2);
        double sqr_b = Math.pow(b, 2);
        double sqr_c = Math.pow(c, 2);
        System.out.printf("Triangle:%.2f", Math.sqrt(4 * sqr_a * sqr_b - Math.pow(sqr_a + sqr_b - sqr_c, 2))/4);
    }
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] str = ip.split("\\s+");
        if(str.length == 1){
            area_circle(Integer.parseInt(str[0]));
        }
        else if(str.length == 2){
            area_rectangle(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
        }
        else if(str.length == 3){
            area_triangle(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
        }
        sc.close();
    }
}