import java.util.Scanner;
interface Borrowable{
    void checkIn(String bUser);
    void checkOut();
}
class Book implements Borrowable{
    String bookId;
    String title;
    String author;
}
class TextBooks extends Book{
    String status;
    String borrowedUser;
    public void checkIn(String bUser){
        this.status = "Borrowed";
        this.borrowedUser = bUser;
    }
    public void checkOut(){
        this.status = "Available";
    } 
}
class ReferenceBooks extends Book{
    public void checkIn(String bUser){
        System.out.println("Invalid");
    }
    public void checkOut(){
        System.out.println("Cannot be borrowed");
    } 
} 
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter you choice: ");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter ID, Title and Author(Line by line");
                String id = sc.nextLine();
                String title = sc.nextLine();
                String author = sc.nextLine();
            }
            else if(choice == 2){

            }
            else if(choice == 3){

            }
            else if(choice == 4){

            }
            else if(choice == 5){

            }
            else if(choice == 6){
                break;
            }
        }
    }
}
