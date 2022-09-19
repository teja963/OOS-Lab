import java.util.*;
import java.lang.*;
public class Q3{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] str = ip.split(" ");
        if(str.length == 1){
            Square sq_obj = new Square(Integer.parseInt(str[0]));
            System.out.println("Square Perimeter "+sq_obj.Perimeter());
            System.out.println("Square Area "+sq_obj.Area());
        }
        else if(str.length == 2){
            Rectangle rect_obj = new Rectangle(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
            System.out.println("Rectangle Perimeter "+rect_obj.Perimeter());
            System.out.println("Rectangle Area "+rect_obj.Area());
        }
        sc.close();
    }
    public static class Rectangle{
        Integer length;
        Integer breadth;
        public Rectangle(Integer length, Integer breadth){
            this.length = length;
            this.breadth = breadth;
        }
        public int Area(){
            return length * breadth;
        }
        public int Perimeter(){
            return 2*(length + breadth);
        }
    }
    public static class Square extends Rectangle{
        public Square(Integer a){
            super(a, a);
        }
    } 
}