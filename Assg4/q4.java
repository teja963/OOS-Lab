import java.util.*;
import java.lang.*;

class q4{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        TellphoneCall obj = new TellphoneCall();
        obj.readCustomer();
        System.out.println(obj.computeBill());
    }

    public static class TellphoneCall{
        String phNo;
        String custName;
        Integer callSlots;
        Integer totalBill;
        public TellphoneCall(){

        }

        public void readCustomer(){
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            String num = sc.nextLine();
            Integer call_count = Integer.parseInt(sc.nextLine());
            this.phNo = num;
            this.custName = name;
            this.callSlots = call_count;
            this.totalBill = 0;
        }

        public int computeBill(){
            this.totalBill = 300;
            if(callSlots <= 100)this.totalBill += 500;
            else if(callSlots > 100 && callSlots <= 200)this.totalBill += (callSlots*8);
            else if(callSlots > 200 && callSlots <= 300)this.totalBill += (callSlots*10);
            else if(callSlots > 300)this.totalBill += (callSlots*15);
            return this.totalBill;
        }
    }
}