import java.util.*;
import java.lang.*;

public class q6{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String ip1 = sc.nextLine();
        String ip2 = sc.nextLine();
        if(ip1.indexOf(',') == -1 || ip2.indexOf(',') == -1)System.out.println("INVALID");
        else {
            Point obj1 = new Point();
            Point obj2 = new Point();
            String[] str = ip1.split("\\,");
            obj1.x = (float)(Integer.parseInt(str[0]));
            obj1.y = (float)(Integer.parseInt(str[1]));
            str = ip2.split("\\,");
            obj2.x = (float)(Integer.parseInt(str[0]));
            obj2.y = (float)(Integer.parseInt(str[1]));
            Point ans = new Point();
            ans = ans.midpoint(obj1, obj2);
            System.out.printf("%.2f", ans.x);
            System.out.print(",");
            System.out.printf("%.2f", ans.y);
        }
    }

    public static class Point{
        float x;
        float y;
        public Point(){
        }

        public Point midpoint(Point p1, Point p2){   
            Point ans = new Point();
            ans.x = (p1.x+p2.x)/2;
            ans.y = (p1.y+p2.y)/2;     
            return ans;
        }
    }
}
