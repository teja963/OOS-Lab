import java.io.*;
import java.util.*;

// If the stockNumber is negative or higher than 999 print InvalidStockNumber

// If the quantity is less than or equal to 0 print InvalidQuantity

// If the price is greater than 100.0 print InvalidPrice

class Inventory{
    int stockNumber;
    int quantity;
    double price;
    
    public Inventory(int stockNumber,int quantity,double price){
        this.stockNumber = stockNumber;
        this.quantity = quantity;
        this.price = price;
    }
    
    public int dataEntry(){
       try{
            if(stockNumber < 0 || stockNumber > 999){
            throw new ArithmeticException();
        }else if(quantity < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else if(price > 100){
            throw new NumberFormatException();
        }
       }
        
        catch(ArithmeticException e){
            System.out.println("InvalidStockNumber");
            return -1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("InvalidQuantity");
            return -1;
        }
        catch(NumberFormatException e){
            System.out.println("InvalidPrice");
            return -1;
        }
        
        return 1;
            
    }
    
    public void display(){
        System.out.println("Stocknumber:"+stockNumber);
        System.out.println("Quantity:"+quantity);
        System.out.println("Price:"+price);
    }
}


public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        Inventory[] arr = new Inventory[n];
        for(int i = 0;i<n;i++){
            String[] details = scanner.nextLine().split(" ");
            arr[i] = new Inventory(Integer.parseInt(details[0]),Integer.parseInt(details[1]),Double.parseDouble(details[2]));
            
        }
        
        for(int i= 0;i<arr.length;i++){
             if(arr[i].dataEntry() == -1)
                 return;
        }
            
        
        for(int i = 0;i<arr.length;i++){
            arr[i].display();
        }
    }
}
