import java.io.*;
import java.util.*;

interface DivisorArthimatic{
    public abstract double divisorSum(int n);
}

class SumDivisor implements DivisorArthimatic{
    public double divisorSum(int n){
        int sum = 0;
        for(int i = 1;i*i<= n;i++){
            if(n%i == 0){
                sum += i + n/i;
            }
        }
        return (double)sum;
    }
}

class InverseSumDivisor implements DivisorArthimatic{
    public double divisorSum(int n){
        int sum = 0;
        for(int i = 1;i*i <= n;i++){
            if(n%i == 0){
                sum += i + n/i;
            }
        }
        double retval = (double)sum;
        double nval = (double)n;
        return retval/nval;
    }
}

class TestDivisorArithmetics{
    int n;
    public TestDivisorArithmetics(int n){
        this.n = n;
    }
    
    public void getans(){
    SumDivisor a = new SumDivisor();
    InverseSumDivisor b = new InverseSumDivisor();
    int ans1 = (int)a.divisorSum(n);
    System.out.println(ans1);
    double ans2 = b.divisorSum(n);
    ans2 = ans2*100;
    ans2 = Math.round(ans2);
    ans2 = ans2/100;
    System.out.printf("%.2f\n",ans2);
    }
    
    
}

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TestDivisorArithmetics test = new TestDivisorArithmetics(scanner.nextInt());
        test.getans();
    }
}
