import java.io.*;
import java.util.*;

class Contact{
    public List<String> name;
    public String phno;
    
    public Contact(String[] namelist,String phno){
        this.name = new ArrayList<String>();
        for(String str : namelist){
            this.name.add(str);
        }
        this.name.remove(name.size()-1);
        this.phno = phno;
    }
    
    public boolean searchName(String sub){
       return name.get(0).equals(sub);
    }
    
    public boolean sameContact(Contact con){
        if(name.size() != con.name.size())
            return false;
        for(int i = 0;i<name.size();i++){
            if(!name.get(i).equals(con.name.get(i)))
                  return false;
        }
        
        return phno.equals(con.phno);
    }
    
    public void print(){
        for(String nam : name)
            System.out.print(nam+" ");
        System.out.println(phno);
    }
    
}

class PhoneBook{
    List<Contact> mylist;
    
    public PhoneBook(){
        mylist = new ArrayList<Contact>();
    }
    
    public void insertEntry(Contact newcontact){
        for(Contact current : mylist){
            if(current.sameContact(newcontact))
                return;
        }
        mylist.add(newcontact);
    }
    
    public int loopup(String nam){
        int retval = 0;
        for(Contact contact : mylist){
            if(contact.searchName(nam)){
                contact.print();
                retval = 1;
            }
        }
        
        return retval;
    }
}

public class Solution {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int n = scanner.nextInt();
        scanner.nextLine();
        
        PhoneBook pb = new PhoneBook();
       for(int i = 0;i<n;i++){
           String[] details = scanner.nextLine().split(" ");
           long phno = 0;
           try{
               phno = Long.parseLong(details[details.length-1]);
           }
           
           catch(Exception e){
               System.out.println("IncorrectPhonenumber");
               return;
           }
           
           Contact newcontact = new Contact(details,details[details.length-1]);
           pb.insertEntry(newcontact);
       }
        
       
                String str = scanner.nextLine();
    
                 String[] details = str.split(" ");
                 if(pb.loopup(details[1]) == 0)
                   System.out.println("NoSuchEntry");
        
       
        
        
        
        
    }
}
