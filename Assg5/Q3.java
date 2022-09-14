import java.util.*;
import java.lang.*;
class Q3{
    public static class Comp implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            if(s1.get_height() == s2.get_height())return s1.get_name().compareTo(s2.get_name());
            return s1.get_height() - s2.get_height();
        }
    }
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.next());
        sc.nextLine();
        ArrayList<Student> my_list = new ArrayList<Student>();
        ArrayList<String> ans = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            String ip = sc.nextLine();
            String[] str = ip.split("\\,+");
            my_list.add(new Student(str[0].substring(1), str[1], str[2].substring(0, str[2].length()-1)));
        }
        Collections.sort(my_list, new Comp());
        Integer prev = 0, k = 0;
        for(Student s: my_list){
            if(prev != s.get_height()){
                ans.add(s.get_name());
                k++;
                prev = s.get_height();
            }
        }
        System.out.println(k);
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i));
            if(i != ans.size()-1)System.out.print(",");
        }
    }
    public static class Student{
        String name;
        String rollNo;
        String height;
        Student(String name, String rollNo, String height){
            this.name = name;
            this.rollNo = rollNo;
            this.height = height;
        }
        public String get_name(){
            return this.name;
        }

        public Integer get_roll(){
            Integer roll_num = Integer.parseInt(this.rollNo);
            return roll_num;
        }

        public Integer get_height(){
            Integer height = Integer.parseInt(this.height);
            return height;
        }
    }
}