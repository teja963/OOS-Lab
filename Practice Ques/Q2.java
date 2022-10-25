import java.io.*;
import java.util.*;
import java.lang.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Choose the 3D Object:\n1. Box\n2. Cube\n3. Cylinder\n4. Cone\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice  = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter the length: ");
                int l = sc.nextInt();
                System.out.print("Enter the breadth: ");
                int b = sc.nextInt();
                System.out.print("Enter the height: ");
                int h = sc.nextInt();
                Box b1 = new Box(l,b,h);
                b1.print();
            }
            else if(choice == 2) {
                System.out.print("Enter the side: ");
                int s = sc.nextInt();
                Cube c1 = new Cube(s);
                c1.print();
            }
            else if(choice == 3) {
                System.out.print("Enter the radius: ");
                int r = sc.nextInt();
                System.out.print("Enter the height: ");
                int h = sc.nextInt();
                Cylinder cy1 = new Cylinder(r,h);
                cy1.print();
            }
            else if(choice == 4) {
                System.out.print("Enter the radius: ");
                int r = sc.nextInt();
                System.out.print("Enter the height: ");
                int h = sc.nextInt();
                Cone c1 = new Cone(r,h);
                c1.print();
            }
            else
                return;
        }

    }
}

abstract class ThreeDObject {
    int x, y, z;
    ThreeDObject(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    Box(int x, int y, int z) {
        super(x, y, z);
    }
    double wholeSurfaceArea() {
        return 2*(x*y + y*z + z*x);
    }
    double volume() {
        return x*y*z;
    }
    void print() {
        System.out.println("Box: Whole Surface Area = "+wholeSurfaceArea()+", Volume = "+volume());
    }

}

class Cube extends ThreeDObject {
    Cube(int x) {
        super(x, x, x);
    }
    double wholeSurfaceArea() {
        return 6*x*x;
    }
    double volume() {
        return x*x*x;
    }
    void print() {
        System.out.println("Cube: Whole Surface Area = "+wholeSurfaceArea()+", Volume = "+volume());
    }

}

class Cylinder extends ThreeDObject {
    Cylinder(int x, int y) {
        super(x, y, 0);
    }
    double wholeSurfaceArea() {
        return 2*3.14*x*y + 2*3.14*x*x;
    }
    double volume() {
        return 3.14*x*x*y;
    }
    void print() {
        System.out.println("Cylinder: Whole Surface Area = "+wholeSurfaceArea()+", Volume = "+volume());
    }
}

class Cone extends ThreeDObject {
    Cone(int x, int y) {
        super(x, y, 0);
    }
    double wholeSurfaceArea() {
        return 3.14*x*x + 3.14*x*Math.sqrt(x*x + y*y);
    }
    double volume() {
        return 3.14*x*x*y/3;
    }
    void print() {
        System.out.println("Cone: Whole Surface Area = "+wholeSurfaceArea()+", Volume = "+volume());
    }
}