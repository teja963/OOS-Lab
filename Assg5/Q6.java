import java.util.*;
import java.lang.*;
public class Q6{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        ArrayList<PermanentEmployee> perm_list = new ArrayList<PermanentEmployee>();
        ArrayList<TemporaryEmployee> temp_list = new ArrayList<TemporaryEmployee>();
        for(int i = 0; i < n; i++){
            String ip = sc.nextLine();
            String[] str = ip.split("\\s+");
            if(str.length == 4){
                perm_list.add(new PermanentEmployee(str[1], str[2], Double.parseDouble(str[3])));
            }
            else if(str.length == 5){
                temp_list.add(new TemporaryEmployee(str[1], str[2], Double.parseDouble(str[3]), Double.parseDouble(str[4])));
            }
        }
        String emp_id = sc.nextLine();
        boolean found = false;
        for(PermanentEmployee pe: perm_list){
            if(pe.getEmployeeId().equals(emp_id)){
                found = true;
                System.out.println(pe.getEmployeeId()+" "+pe.getEmployeeName()+" "+pe.CalculateSalary());
            }
        }
        for(TemporaryEmployee t: temp_list){
            if(t.getEmployeeId().equals(emp_id)){
                found = true;
                System.out.println(t.getEmployeeId()+" "+t.getEmployeeName()+" "+t.CalculateSalary());
            }
        }
        if(found == false)System.out.println("-1");
        sc.close();
    }
    public static class Employee{
        String employeeId;
        String employeeName;
        double salary;
        public double CalculateSalary(){
            return this.salary;
        }
        public String getEmployeeId(){
            return this.employeeId;
        }
        public String getEmployeeName(){
            return this.employeeName;
        }
    }
    public static class PermanentEmployee extends Employee{
        double basicPay;
        double PFAmount;
        PermanentEmployee(String employeeId, String employeeName, double salary){
            super.employeeId = employeeId;
            super.employeeName = employeeName;
            super.salary = salary;
            this.basicPay = salary;
            this.PFAmount = 0.12*salary;
        }
        public double CalculateSalary(){
            return this.basicPay - this.PFAmount;
        }
    }
    public static class TemporaryEmployee extends Employee{
        double hoursWorked;
        double hourlyWages;
        TemporaryEmployee(String employeeId, String employeeName, double hoursWorked, double hourlyWages){
            super.employeeId = employeeId;
            super.employeeName = employeeName;
            this.hoursWorked = hoursWorked;
            this.hourlyWages = hourlyWages;
            super.salary = hourlyWages * hoursWorked;
        }
        public double CalculateSalary(){
            return super.salary;
        }
    }
}