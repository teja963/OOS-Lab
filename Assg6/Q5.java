import java.util.*;
import java.lang.*;
public class Q5{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String ip1 = sc.nextLine();
        String[] amount = ip1.split(" ");
        Integer n = Integer.parseInt(sc.nextLine());
        Student[] arr = new Student[n];
        for(int i = 0; i < n; i++){
            String ip = sc.nextLine();
            String[] str = ip.split(" ");
            if(str[1].charAt(0) == 'B'){
                arr[i] = new Undergraduate(str[0], str[1], Integer.parseInt(amount[0]));
            }
            else{
                arr[i] = new Postgraduate(str[0], str[1], Integer.parseInt(amount[1]));
            }
        }
        String search = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(arr[i].getRoll().equals(search)){
                arr[i].getFeeDetails();
            }
        }
    }
}
abstract class Student{
    private String name;
    private String roll_number;
    public Student(String name, String roll_number){
        this.name = name;
        this.roll_number = roll_number;
    }
    public String getRoll(){
        return this.roll_number;
    }
    public abstract void getFeeDetails();
}
class Undergraduate extends Student{
    private int fee_amount;
    public Undergraduate(String name, String roll_number, int fee_amount){
        super(name, roll_number);
        this.fee_amount = fee_amount;
    }
    public void getFeeDetails(){
        System.out.println(this.fee_amount);
    }
}
class Postgraduate extends Student{
    private int fee_amount;
    public Postgraduate(String name, String roll_number, int fee_amount){
        super(name, roll_number);
        this.fee_amount = fee_amount;
    }
    public void getFeeDetails(){
        System.out.println(this.fee_amount);
    }
}