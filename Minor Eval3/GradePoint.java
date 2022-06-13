import java.io.*;
import java.util.*;
import java.io.*;

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
      
               int n = scanner.nextInt();
               scanner.nextLine();
               Student[] arr = new Student[n];
               for(int i = 0;i<n;i++){
                     String[] details = scanner.nextLine().split(" ");
                   try{
                       if(details.length != 3){
                           throw new NumberFormatException();
                          // return;
                       }
                         //  throw new Exception("Format Error:"+details[0]);
                       int k = Integer.parseInt(details[1]);
                       double val = Double.parseDouble(details[2]);
                       if(k > 100){
                           throw new ArrayIndexOutOfBoundsException();
                           //return;
                       }
                           //throw new Exception("Overlimit:"+details[0]);
                       if(k < 0 || val < 0){
                           throw new NoSuchElementException();
                           //return;
                       }
                           // throw new Exception("NegativeInput:"+details[0]);
                   }
                   catch(ArrayIndexOutOfBoundsException e){
                       System.out.println("Overlimit"+details[0]);
                       return;
                   }
                   catch(NumberFormatException e){
                       System.out.println("FormatError:"+details[0]);
                       return;
                   }
                   catch(NoSuchElementException e){
                       System.out.println("NegativeInput:"+details[0]);
                       return;
                   }
                   
                     arr[i] = new Student(details[0],Double.parseDouble(details[2]),Integer.parseInt(details[1]));
               }

               for(int i = 0;i<arr.length;i++){
                    Student current = arr[i];
                  try{  
                      if(current.hours == 0)
                          throw new ArithmeticException();
                   double gp = current.points/current.hours;
                   if(gp < 1.5 && current.hours < 30)
                       System.out.println(current.name);
                   else if(gp < 1.75 && current.hours >= 30 && current.hours < 60)
                       System.out.println(current.name);
                   else if(gp < 2.0)
                        System.out.println(current.name);
                   else
                       continue;
                   
                  }
                   
                   catch(Exception e){
                       System.out.println("ArithmeticError:"+current.name);
                       return;
                   }
               }
            
        
        
    }
    
    
}

class Student{
    String name;
    double points;
    int hours;
    public Student(String name,double points,int hours){
        this.name = name;
        this.hours = hours;
        this.points = points;
    }
}
