import java.io.*;
import java.util.*;

class Node{
    private int data;
    public Node next;
    public Node(int data){
        this.data = data;
    }
    
    public int getdata(){
        return this.data;
    }
    
    public void setdata(int data){
        this.data = data;
    }
    
}


class LinkedList{
    Node root;
    int length = 0;
    int capacity = 0;
    
    public LinkedList(int num){
        this.capacity = num;
    }
    
    public void setcapacity(int num){
        this.capacity = num;
    }
    
    
    public LinkedList(){
        this.root = null;
    }
    
    public void addList(int data){
        
        if(root == null){
            root = new Node(data);
            length = 1;
            return;
        }
        Node runner = root;
        while(runner.next != null){
            runner = runner.next;
        }
        length++;
        runner.next = new Node(data);
    }
    
    
    public int getlength(){
        return this.length;
    } 
        
        
    public void dispList(){
        Node runner = root;
        while(runner != null){
            System.out.print(runner.getdata()+" ");
            runner = runner.next;
        }
        System.out.println();
        return;
    }
}

class SortList{
    
    public LinkedList dup(LinkedList L){
        LinkedList dup = new LinkedList();
        Node runner = L.root;
        while(runner != null){
            dup.addList(runner.getdata());
            runner = runner.next;
        }
        return dup;
    }
    public LinkedList sortList(LinkedList L){
        LinkedList sorted = dup(L);
        Node runner1 = sorted.root;
        Node runner2 = null;
        for(;runner1 != null ; runner1 = runner1.next){
            for(runner2 = runner1.next;runner2 != null ; runner2 = runner2.next){
                if(runner1.getdata() > runner2.getdata()){
                    int temp = runner1.getdata();
                    runner1.setdata(runner2.getdata());
                    runner2.setdata(temp);
                }
            }
        }
        dispList(sorted);
        return sorted;
    }
    
    public void dispList(LinkedList reversed){
        Node runner = reversed.root;
        while(runner != null){
            System.out.print(runner.getdata()+" ");
            runner = runner.next;
        }
        System.out.println();
    }
    
    public LinkedList addList(LinkedList L){
        LinkedList sorted = sortList(L);
        LinkedList org =  dup(L);
        LinkedList addition = new LinkedList();
        Node runner1 = sorted.root;
        Node runner2 = L.root;
        while(runner1 != null && runner2 != null)
            addition.addList(runner1.getdata() + runner2.getdata());
        return addition;
    }
}

class LinkedListOperation{
    public  LinkedList removeDuplicates(LinkedList L){
        SortList s = new SortList();
        LinkedList dup = s.sortList(L);
        Node runner = dup.root;
        while(runner != null && runner.next != null){
            if(runner.getdata() == runner.next.getdata()){
                runner.next = runner.next.next;
            }else{
                runner = runner.next;
            }
        }
        
        return dup;
    }
    
    public double middleElement(LinkedList L){
        Node runner1 = L.root;
        Node runner2 = L.root;
        while(runner2.next != null){
            runner1 = runner1.next;
            runner2 = runner2.next.next;
        }
        
        if(L.getlength()%2 == 1){
            return  (double)runner2.getdata();
        }else{
            Node runner = L.root;
            while(runner.next != runner2){
                runner = runner.next;
            }
            
            return  ((double) (runner.getdata()+runner2.getdata()))/2;
        }
        
    }
    
}






public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
          LinkedList L = new LinkedList(scanner.nextInt());
        int exitstatus = 0;
        while(true){
            String str = scanner.next();
            switch(str){
                case "A":
                    L.addList(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case "I":
                    L.setcapacity(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Increased");
                    break;
                case "D":
                    L.dispList();
                    break;
                case "S":
                    if(scanner.next().equals("s")){
                        SortList s = new SortList();
                        LinkedList sorted = s.sortList(L);
                      //  sorted.dispList();
                    }
                    break;
                case "R":
                    if(scanner.next().equals("r")){
                        SortList s = new SortList();
                        LinkedList add = s.addList(L);
                        add.dispList();
                    }
                    break;
                case "P":
                    if(scanner.next().equals("p")){
                        LinkedListOperation llp = new LinkedListOperation();
                        LinkedList fresh = llp.removeDuplicates(L);
                        fresh.dispList();
                    }
                    break;
                case "M":
                    if(scanner.next().equals("m")){
                        LinkedListOperation llp = new LinkedListOperation();
                        double num = llp.middleElement(L);
                        System.out.println(Math.round(num*100)/100D);
                    }
                    break;
                case "E":
                    System.out.println("End");
                    exitstatus = 1;
                    break;
                     
            }
            if(exitstatus == 1)
                break;
        }
    }
}


// Got test cases wrong but sure approch is right
