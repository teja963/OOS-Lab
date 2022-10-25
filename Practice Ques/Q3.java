import java.util.*;

class Department {
	private String deptName;
	private String deptHead;

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public String getDeptHead() {
		return this.deptHead;
	}
}

class Hostel {
	private String hostelName;
	private String hostelLocation;
	private int numberOfRooms;

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public void setHostelLocation(String hostelLocation) {
		this.hostelLocation = hostelLocation;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getHostelName() {
		return this.hostelName;
	}

	public String getHostelLocation() {
		return this.hostelLocation;
	}

	public int getNumberOfRooms() {
		return this.numberOfRooms;
	}
}

class Student {
	private Department dept = new Department();
	private Hostel host = new Hostel();
	private String studentName;
	private String registerNo;
	private String electiveSubject;
	private int avgMarks;

	public void setStudent(String studentName, String registerNo, String electiveSubject, int avgMarks) {
		this.studentName = studentName;
		this.registerNo = registerNo;
		this.electiveSubject = electiveSubject;
		this.avgMarks = avgMarks;
	}

	public void setStudentHostel(String hostelName, String hostelLocation, int numberOfRooms) {
		this.host.setHostelName(hostelName);
		this.host.setHostelLocation(hostelLocation);
		this.host.setNumberOfRooms(numberOfRooms);
	}

	public void setStudentDepartment(String deptname, String deptHead) {
		this.dept.setDeptName(deptname);
		this.dept.setDeptHead(deptHead);
	}

	public String getRegisterNo() {
		return this.registerNo;
	}

	public void printStudent() {
		System.out.println(this.studentName + " " + this.registerNo + " " + this.electiveSubject + " " + this.avgMarks
				+ " " + this.dept.getDeptName() + " " + this.host.getHostelName());
	}
}

public class Q3 {

	public static void main(String[] args) {
		System.out.println("1. Admit new student\n2. Migrate hostel\n3. Search a student\n4.Exit");
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		System.out.println();
		while (flag) {
			System.out.print("Enter your choice: ");
			int c = scan.nextInt();
			if (c == 1) {
				Student s = new Student();
				System.out.print("Enter the student details: ");
				scan.nextLine();
				String xs = scan.nextLine();
				String[] x = xs.split("\\s+");
				String sub = "";
				for (int i = 2; i < x.length - 1; i++) {
					sub += x[i] + " ";
				}
				s.setStudent(x[0], x[1], sub, Integer.parseInt(x[x.length - 1]));
				System.out.print("Enter the department details: ");
				String ys = scan.nextLine();
				String[] y = ys.split("\\s+");
				s.setStudentDepartment(y[0], y[1]);
				System.out.print("Enter the hostel details: ");
				String zs = scan.nextLine();
				String[] z = zs.split("\\s+");
				s.setStudentHostel(z[0], z[1], Integer.parseInt(z[2]));
				students.add(s);
			} else if (c == 2) {
				System.out.print("Enter the student registration number and new hostel: ");
				scan.nextLine();
				String zs = scan.nextLine();
				String[] z = zs.split("\\s+");
				for (Student student : students) {
					if (student.getRegisterNo().equalsIgnoreCase(z[0])) {
						student.setStudentHostel(z[1], "Calicut", 500);
						break;
					}
				}
			} else if (c == 3) {
				System.out.print("Enter the registration number: ");
				scan.nextLine();
				String regNo = scan.nextLine();
				for (Student student : students) {
					if (student.getRegisterNo().equalsIgnoreCase(regNo)) {
						student.printStudent();
						break;
					}
				}
			} else {
				flag = false;
			}

		}
		scan.close();

	}

}
