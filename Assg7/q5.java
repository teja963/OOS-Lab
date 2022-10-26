import java.util.*;
interface OrderStudents{
    void OrderByRollno(ArrayList<Student> my_list);
    void OrderByName(ArrayList<Student> my_list);
}
class Student{
    String name;
    String rollno;
    String address;
    public void OrderByRollno(ArrayList<Student> my_list){
        Collections.sort(my_list, new byRollno());
        for(Student stu: my_list){
            System.out.println(stu.rollno+" "+stu.name+" "+stu.address);
        }
        System.out.println();
    }
    public void OrderByName(ArrayList<Student> my_list){
        Collections.sort(my_list, new byName());
        for(Student stu: my_list){
            System.out.println(stu.rollno+" "+stu.name+" "+stu.address);
        }
    }
}
class byRollno implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.rollno.compareTo(s2.rollno);
    }
}
class byName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}
public class q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> my_list = new ArrayList<Student>();
        Student stu_obj = new Student();
        for(int i = 0; i < numberOfStudents; i++){
            String ip = sc.nextLine();
            String[] str = ip.split(" ");
            Student obj = new Student();
            obj.rollno = str[0];
            obj.name = str[1];
            obj.address = str[2];
            my_list.add(obj);
        }
        System.out.println();
        stu_obj.OrderByRollno(my_list);
        stu_obj.OrderByName(my_list);
    }
}
