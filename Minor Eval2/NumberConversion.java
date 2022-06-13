import java.io.*;
import java.util.*;

class ConversionSystem{
    public double[] conversionNumber(double a,double r){
        double[] coordinate = new double[2];
        double theta = a*(Math.PI/180);
        coordinate[0] = r * Math.sin(theta);
        coordinate[1] = r * Math.cos(theta);
        return coordinate;
    }
    
    public int conversionNumber(String str){
        int num = 0;
        for(int i = 0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                int val = str.charAt(i) - '0';
                num = num*10 + val;
            }
        }
        
        return num;
    }
}

class BinarytoDecimal extends ConversionSystem{
    public int conversionNumber(String str){
        double num = 0;
        for(int i = str.length()-1;i>=0;i--){
            double val = str.charAt(i) - '0';
            double power = str.length() - i - 1;
            num = num+val*Math.pow(2,power);
        }
        
        return (int)num;
    }
}

class DecimaltoBinary extends ConversionSystem{
    public int conversionNumber(String str){
        int num = Integer.parseInt(str);
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            int val = num%2;
            num = num/2;
            sb.insert(0,val);
        }
        
        return Integer.parseInt(sb.toString());
    }
}

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
      try{
           char in = scanner.nextLine().charAt(0);
        if(in == 'i'){
            String[] input = scanner.nextLine().split(" ");
            if(input[1].equals("2")){
                BinarytoDecimal bd = new BinarytoDecimal();
                 int num = bd.conversionNumber(input[0]);
                System.out.println(num);
            }else if(input[1].equals("10")){
                DecimaltoBinary db = new DecimaltoBinary();
                int ans = db.conversionNumber(input[0]);
                System.out.println(ans);
            }else{
                ConversionSystem sy = new ConversionSystem();
                int num = sy.conversionNumber(input[0]);
                System.out.println(num);
            }
        }else{
             String[] input = scanner.nextLine().split(" ");
             ConversionSystem sy = new ConversionSystem();
             double[] ans = sy.conversionNumber(Double.parseDouble(input[0]),Double.parseDouble(input[1]));
             System.out.printf("%.3f %.3f",ans[0],ans[1]);
        }
      }
        catch(Exception e){
            System.out.println("WRONGOUTPUT");
        }
    }
}
