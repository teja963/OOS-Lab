import java.util.*;
import java.lang.*;

public class q5{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Integer age = Integer.parseInt(sc.nextLine());
        Person obj = new Person(name, age);
        System.out.println(obj.calculatePension());
        sc.close();
    }

    public static class Person{
        String name;
        Integer age;
        public Person(String name, Integer age){
            this.name = name;
            this.age = age;
        }

        public int calculatePension(){
            if(this.age >= 60 && this.age < 70)return 500;
            else if(this.age >= 70)return 600;
            return 0;
        }
    }
}