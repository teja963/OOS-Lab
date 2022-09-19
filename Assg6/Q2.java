import java.util.*;
import java.lang.*;
public class Q2{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Integer amount = Integer.parseInt(sc.nextLine());
        StateBank stb_obj = new StateBank();
        ICIC icic_obj = new ICIC();
        AXIS axis_obj = new AXIS();
        System.out.println("SBI Interest is: "+stb_obj.getInterestAmount(amount));
        System.out.println("ICIC Interest is: "+icic_obj.getInterestAmount(amount));
        System.out.println("AXIS interest is: "+axis_obj.getInterestAmount(amount));
        sc.close();
    }
    public static class Bank{
        public double getInterestAmount(int amount){
            return 0;
        }
    }
    public static class StateBank extends Bank{
        public double getInterestAmount(int amount){
            return (amount * 5)/100;
        }
    }
    public static class ICIC extends Bank{
        public double getInterestAmount(int amount){
            return (amount * 6)/100;
        }
    }
    public static class AXIS extends Bank{
        public double getInterestAmount(int amount){
            return (amount * 7)/100;
        }
    }
}