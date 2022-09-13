import java.util.*;
import java.lang.*;
public class Q7{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        ArrayList<PGStudent> my_list = new ArrayList<PGStudent>();
        for(int i = 0; i < n; i++){
            String ip = sc.nextLine();
            String[] str = ip.split("\\:+");
            my_list.add(new PGStudent(str[0], Integer.parseInt(str[1]),null, Double.parseDouble(str[3]), str[2], 1));
        }
        Collections.sort(my_list, new Comp());
        for(PGStudent p: my_list){
            System.out.println(p.getPersonName());
        }
        sc.close();
    }
    public static class Comp implements Comparator<PGStudent>{
        public int compare(PGStudent p1, PGStudent p2){
            return (int)(p2.getPercentageOfMarks() - p1.getPercentageOfMarks());
        }
    }
    public static class Person{
        String personName;
        Integer age;
        Person(String personName, Integer age){
            this.personName = personName;
            this.age = age;
        }
        public String getPersonName(){
            return this.personName;
        }
    }
    public static class Student extends Person{
        String rollNumber;
        double percentageOfMarks;
        Student(String personName, Integer age, String rollNumber, double percentageOfMarks){
            super(personName, age);
            this.rollNumber = rollNumber;
            this.percentageOfMarks = percentageOfMarks;
        }
        public double getPercentageOfMarks(){
            return this.percentageOfMarks;
        }
    }
    public static class PGStudent extends Student{
        String elective;
        Integer numberOfSubjects;
        PGStudent(String personName, Integer age, String rollNumber, double percentageOfMarks, String elective, Integer numberOfSubjects){
            super(personName, age, rollNumber, percentageOfMarks);
            this.elective = elective;
            this.numberOfSubjects = numberOfSubjects;
        }
    }
}