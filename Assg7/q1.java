import java.util.*;
interface creditCard{
    abstract int convertRupees(int rupee);
    abstract int convertDollars(int dollars);
    abstract int convertPounds(int pounds);
}
class Bank implements creditCard{
    public int convertRupees(int rupee){
        return rupee;
    }
    public int convertDollars(int dollars){
        return dollars * 70;
    }
    public int convertPounds(int pounds){
        return pounds * 100;
    }
}
class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        sc.nextLine();
        String ip = sc.nextLine();
        String[] str = ip.split(" ");
        Bank b_obj = new Bank();
        int purchase = b_obj.convertRupees(Integer.parseInt(str[0]))+b_obj.convertDollars(Integer.parseInt(str[1]))+b_obj.convertPounds(Integer.parseInt(str[2]));
        if(amount >= purchase)System.out.println(amount - purchase);
        else System.out.println("Insufficient balance");
        sc.close();
    }
}