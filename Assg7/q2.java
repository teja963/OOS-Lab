import java.util.*;
interface HDFC{
    void transaction(String bank_name, int bank_bal, int product_price, LinkedList<Money> p);
}
interface ICIC{
    void transaction(String bank_name, int bank_bal, int product_price, LinkedList<Money> p);
}
class Money{
    int filpkart_bal;
    int customer_bal;
}
class Filpkart implements HDFC,ICIC{
    static int fbal;
    public void transaction(String bank_name, int bank_bal, int product_price, LinkedList<Money> p){
            Money mobj = new Money();
            fbal += product_price;
            mobj.filpkart_bal = fbal;
            mobj.customer_bal = (bank_bal - product_price);
            p.add(mobj);
        }
}
public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfTransactions = sc.nextInt();
        sc.nextLine();
        Filpkart filp_obj = new Filpkart();
        LinkedList<Money> p = new LinkedList<>();
        for(int i = 0; i < numberOfTransactions; i++){
            String ip = sc.nextLine();
            String[] str = ip.split(" ");
            filp_obj.transaction(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), p);
        }
        for(Money m: p){
            System.out.println(m.filpkart_bal+" "+m.customer_bal);
        }
    }
}
