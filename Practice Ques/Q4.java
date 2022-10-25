import java.io.*;
import java.util.*;
import java.lang.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        List<Number> list = new ArrayList<Number>();

        while(true) {
            System.out.println("Choose the Operation:\n1. Add Binary Number\n2. Add Decimal Number\n3. Add Hexadecimal Number\n4. Display Numbers: \n5. Exit");
            System.out.print("Enter your choice: ");
            int choice  = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                BinaryNumber b1 = new BinaryNumber();
                b1.num = num;
                list.add(b1);
            }
            else if(choice == 2) {
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                DecimalNumber d1 = new DecimalNumber();
                d1.num = num;
                list.add(d1);
            }
            else if(choice == 3) {
                System.out.print("Enter the number: ");
                int num = sc.nextInt();
                HexadecimalNumber h1 = new HexadecimalNumber();
                h1.num = num;
                list.add(h1);
            }
            else if(choice == 4) {
                for(Number n : list) {
                    n.showNumber();
                }
                System.out.println();
            }
            else
                return;
        }
    }
}

class Number{
    int num;
    void showNumber(){
        System.out.print("Number: "+num);
    }
}

class BinaryNumber extends Number {
    void showNumber() {
        System.out.print("Binary: "+Integer.toBinaryString(num)+ " ");
    }
}

class DecimalNumber extends Number {
    void showNumber() {
        System.out.print("Decimal: "+Integer.toString(num)+ " ");
    }
}

class HexadecimalNumber extends Number {
    void showNumber() {
        System.out.print("Hexadecimal: "+Integer.toHexString(num)+ " ");
    }
}