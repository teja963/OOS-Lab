import java.io.*;
import java.util.*;

class Shape{
    public double Area(){
        return 0.00;
    }
}

class Sphere extends Shape{
    double radius;
    double pi = 3.14;
    public Sphere(double rad){
        this.radius = rad;
    }
    public double Area(){
        return 4*pi*radius*radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;
    public Rectangle(double len,double bre){
        this.length = len;
        this.breadth = bre;
    }
    
    public double Area(){
        return this.length*this.breadth;
    }
}

class Cylinder extends Shape{
    double height;
    double rad;
    double pi = 3.14;
    public Cylinder(double height,double rad){
        this.height = height;
        this.rad = rad;
    }
    
    public double Area(){
        double ans = 2*pi*rad*height + 2*pi*rad*rad;
        return ans;
    }
}

class Paint{
    double coverage;
    public Paint(double c){
        this.coverage = c;
    }
    
    public double getAmount(double area){
        return area/coverage;
    }
}

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       try{
            String[] in = scanner.nextLine().split(" ");
        if(in[0].equals("S")){
            if(in.length != 4){
                System.out.println("INVALID");
            }else{
                Sphere sp = new Sphere(Double.parseDouble(in[3]));
                double area = sp.Area();
                Paint p = new Paint(Double.parseDouble(in[1]));
                int ans = (int)p.getAmount(area);
                 System.out.println(in[2]+" "+ans);
            }
        }else if(in[0].equals("R")){
            if(in.length != 5){
                System.out.println("INVALID");
            }else{
                Rectangle sp = new Rectangle(Double.parseDouble(in[3]),Double.parseDouble(in[4]));
                double area = sp.Area();
                Paint p = new Paint(Double.parseDouble(in[1]));
                int ans = (int)p.getAmount(area);
                System.out.println(in[2]+" "+ans);
            }
        }else if(in[0].equals("C")){
            if(in.length != 5){
                System.out.println("INVALID");
            }else{
                Cylinder sp = new Cylinder(Double.parseDouble(in[4]),Double.parseDouble(in[3]));
                double area = sp.Area();
                Paint p = new Paint(Double.parseDouble(in[1]));
                int ans = (int)p.getAmount(area);
                System.out.println(in[2]+" "+ans);
            }
        }else{
            System.out.println("INVALID");
        }
       }
       catch(Exception e){
            System.out.println("INVALID");
        }
    }
}
