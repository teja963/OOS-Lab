import java.util.*;
import java.lang.*;
public class Q4{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        ArrayList<String> my_list = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            String ip = sc.nextLine();
            my_list.add(ip);
        }
        for(String ip: my_list){
            String[] str = ip.split("\\:+");
            Integer bal = Integer.parseInt(str[2]);
            if(bal < 100000){
                Sliver obj = new Sliver(str[0], str[1], Double.parseDouble(str[2]));
                System.out.println(str[0]+":"+str[2]+":"+"Sliver:"+obj.availableBalance());
            }
            else if(bal > 100000 && bal < 1000000){
                Gold obj = new Gold(str[0], str[1], Double.parseDouble(str[2]));
                System.out.println(str[0]+":"+str[2]+":"+"Gold:"+obj.availableBalance());
            }
            else if(bal > 1000000){
                Platinum obj = new Platinum(str[0], str[1], Double.parseDouble(str[2]));
                System.out.println(str[0]+":"+str[2]+":"+"Platinum:"+obj.availableBalance());
            }
        }
    }
    public static class Customer{
        String customerName;
        String accountNo;
        double currentBalance;
        Customer(String customerName, String accountNo, double currentBalance){
            this.customerName = customerName;
            this.accountNo = accountNo;
            this.currentBalance = currentBalance;
        }
        public double availableBalance(){
            return this.currentBalance;
        }
        public String getCustomerName(){
            return this.customerName;
        }
    }
    public static class Sliver extends Customer{
        Sliver(String customerName, String accountNo, double currentBalance){
            super(customerName, accountNo, currentBalance);
        }
        public double availableBalance(){
            return super.currentBalance + (super.currentBalance * 0.05);
        }
    }
    public static class Gold extends Customer{
        Gold(String customerName, String accountNo, double currentBalance){
            super(customerName, accountNo, currentBalance);
        }
        public double availableBalance(){
            return super.currentBalance + (super.currentBalance * 0.1);
        }
    }
    public static class Platinum extends Customer{
        Platinum(String customerName, String accountNo, double currentBalance){
            super(customerName, accountNo, currentBalance);
        }
        public double availableBalance(){
            return super.currentBalance + (super.currentBalance * 0.15);
        }
    }
}