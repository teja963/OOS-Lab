import java.io.*;
import java.util.*;

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     
        try{
               int n = scanner.nextInt();
               scanner.nextLine();
               int[] arr = new int[n];
               for(int i = 0;i<n;i++){
                    arr[i] = scanner.nextInt();
                    scanner.nextLine();
                }
        for(int i = 0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
            String[] interval = scanner.nextLine().split(" ");
            String[] dnumber = scanner.nextLine().split(" ");
            if(interval.length != 4 || dnumber.length != 2 || !interval[0].equals("i") || !interval[2].equals("e") || !dnumber[0].equals("d"))
            throw new InputMismatchException();
      
            int left = Integer.parseInt(interval[1])-1;
            int right = Integer.parseInt(interval[3])-1;
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = left;i<=right;i++){
                System.out.print(arr[i]+" ");
                sum += arr[i];
                max = Math.max(max,arr[i]);
                min = Math.min(min,arr[i]);
            }
            System.out.println();
            System.out.println(max+" "+min);
            System.out.println(sum);
            int d = Integer.parseInt(dnumber[1]);
          //  int ans = sum/d;
            if(sum%d == 0)
               System.out.println("YES");
            else
                System.out.println("NO");
        }
        

    
        catch(InputMismatchException e){
            System.out.println("FormatError");
            return;
        }
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexError");
            return;
        }
        
        catch(NoSuchElementException e){
            System.out.println("ArrayIndexError");
            return;
        }
        
        catch(ArithmeticException e){
            System.out.println("DividebyZero");
            return;
        }
        
       
        
        catch(Exception e){
            System.out.println(e);
            return;
        }
        
    }
}
