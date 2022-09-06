import java.util.*;
import java.lang.*;
public class q7{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String ip1 = sc.nextLine();
        String ip2 = sc.nextLine();
        Angle a1 = new Angle();
        Angle a2 = new Angle();
        String[] str = ip1.split("\\s+");
        a1.degrees = Integer.parseInt(str[0]);
        a1.minutes = Integer.parseInt(str[1]);
        str = ip2.split("\\s+");
        a2.degrees = Integer.parseInt(str[0]);
        a2.minutes = Integer.parseInt(str[1]);
        Angle ans = new Angle();
        ans = ans.angleSum(a1, a2);
        System.out.println(ans.degrees+" "+ans.minutes);
    }

    public static class Angle{
        Integer degrees;
        Integer minutes;
        public Angle(){

        }
        
        public Angle angleSum(Angle a1, Angle a2){
            Angle ans = new Angle();
            ans.minutes = (a1.minutes+a2.minutes)%60;
            ans.degrees = (a1.degrees+a2.degrees)+((a1.minutes+a2.minutes)/60);
            return ans;
        }
    }
}