import java.io.*;
import java.util.*;



interface BillGenerator{
    public double generateBill();
    public void displayBill();
}

class ElectricityBill implements BillGenerator{
    int consumerNumber;
    String consumerName;
    int previousMonthReading;
    int currentMonthReading;
    String typeOfConnection;
    
    public ElectricityBill(int consumerNumber,String consumerName,int previousmonth,int currentmonth,String type){
        this.consumerNumber = consumerNumber;
        this.previousMonthReading  = previousmonth;
        this.consumerName = consumerName;
        this.currentMonthReading = currentmonth;
        this.typeOfConnection = type;
    }
    
    public double generateBill(){
        int units = currentMonthReading - previousMonthReading;
        double total = 0;
        if(typeOfConnection.equals("Domestic")){
            if(units > 150){
                int val = units - 150;
                units = 150;
                total += val*4.00;
            }
            if(units > 100){
                int val = units - 100;
                units = 100;
                total += val*3.80;
            }
            if(units > 50){
                int val = units - 50;
                units = 50;
                total += val*3.15;
            }
            if(units > 0){
                int val = units;
                units = 0;
                total += val*3.00;
            }
        }else{
              if(units > 500){
                int val = units - 500;
                units = 500;
                total += val*8.00;
            }
            if(units > 400){
                int val = units - 400;
                units = 400;
                total += val*7.70;
            }
            if(units > 300){
                int val = units - 300;
                units = 300;
                total += val*6.60;
            }
            if(units > 0){
                int val = units;
                units = 0;
                total += val*5.50;
            }
            
        }
        
        return total;
    }
    
    public void displayBill(){
        System.out.println(consumerNumber);
        System.out.println(consumerName);
        int total = currentMonthReading - previousMonthReading;
        System.out.println(total);
        System.out.printf("%.2f\n",generateBill());
    }
}

class PhoneBill implements BillGenerator{
    int customerID;
    String customerName;
    int minutes;
    
    public PhoneBill(int id,String name,int min){
        this.customerName = name;
        this.minutes = min;
        this.customerID = id;
    }
    
    public double generateBill(){
        double total = 0;
        if(minutes > 100){
            total += 250;
            total += (minutes-100)*(1.50);
        }else{
            total = 250;
        }
        
        return total;
    }
    
    public void displayBill(){
        System.out.println(customerID);
        System.out.println(customerName);
        int total = Math.max(0,minutes-100);
        System.out.println(total);
        System.out.printf("%.2f\n",generateBill());
    }
}

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    
    public static boolean checkString(String name){
        for(int i = 0;i<name.length();i++){
            if(name.charAt(i) >= '0' && name.charAt(i) <= '9')
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str = scanner.nextLine();
        if(str.length() == 1 &&  str.charAt(0) == 'P'){
            try{
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                if(!checkString(name))
                    throw new NumberFormatException();
                int min = scanner.nextInt();
                PhoneBill p = new PhoneBill(id,name,min);
                p.displayBill();
            }
              catch(NumberFormatException e){
                System.out.println("NotAStringException");
            }
            
            catch(Exception e){
                System.out.println("NotANumberException");
            }
        }else if(str.length() == 3 && str.charAt(0) == 'E' && (str.charAt(2) == 'D' || str.charAt(2) == 'C')){
            try{
                int id = scanner.nextInt();
                scanner.nextLine();
                String name = scanner.nextLine();
                if(!checkString(name))
                    throw new NumberFormatException();
                int prev = scanner.nextInt();
                int curr = scanner.nextInt();
                String type = "";
                if(str.charAt(2) == 'D')
                    type = "Domestic";
                else
                    type = "Consumer";
                ElectricityBill eb = new ElectricityBill(id,name,prev,curr,type);
                eb.displayBill();
                
            }
            
            catch(NumberFormatException e){
                System.out.println("NotAStringException");
            }
            
            catch(Exception e){
                System.out.println("NotANumberException");
            }
            
        }else{
            System.out.println("INVALID");
        }
    }
}
