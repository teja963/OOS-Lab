import java.util.*;
interface ShapeArea{
    abstract float Area(int length);
}
class Circle implements ShapeArea{
    public float Area(int length){
        return (float)(3.14*length*length);
    }
}
class Square implements ShapeArea{
    public float Area(int length){    
        return (float)length * length;
    }
}
class q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        int length = sc.nextInt();
        sc.nextLine();
        if(ip.equals("Circle")){
            Circle circle_obj = new Circle();
            System.out.println(circle_obj.Area(length));
        }
        else if(ip.equals("Square")){
            Square square_obj = new Square();
            System.out.println(square_obj.Area(length));
        }
    }
}