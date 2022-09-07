import java.util.*;
import java.lang.*;
public class q8{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		Student obj = new Student("",0,0,0,0,0,0);
		while(true){
			String ip = sc.nextLine();
			if(ip.equals("a")){
				String tmp = sc.nextLine();
				String[] str = tmp.split("\\s+");
				Student new_obj = new Student(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]), Integer.parseInt(str[4]), Integer.parseInt(str[5]), Integer.parseInt(str[6]));
				obj.addStudent(new_obj);
			}
			else if(ip.equals("s"))obj.subjectTopper();
			else if(ip.equals("c"))obj.classTopper();
			else if(ip.equals("t"))break;
		}
	}

	public static class Student{
		String studentName;
		Integer rollNo;
		Integer englishScore;
		Integer hindiScore;
		Integer mathsScore;
		Integer scienceScore;
		Integer ssScore;
		List<Student> my_list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		public Student(String studentName, Integer rollNo, Integer englishScore, Integer hindiScore, Integer mathsScore, Integer scienceScore, Integer ssScore){
			this.studentName = studentName;
			this.rollNo = rollNo;
			this.englishScore = englishScore;
			this.hindiScore = hindiScore;
			this.mathsScore = mathsScore;
			this.scienceScore = scienceScore;
			this.ssScore = ssScore;
		}

		public void addStudent(Student obj){
			my_list.add(obj);
		}

		public class update implements Comparator<Student>{
			public int compare(Student s1, Student s2){
				return s1.rollNo - s2.rollNo;
			}
		} 

		public void subjectTopper(){
			Collections.sort(my_list, new update());
			String ip = sc.nextLine();
			int idx = (Integer.parseInt(ip)%10);
			List<Student> result = new ArrayList<Student>();
			Integer ans = 0;
			for(Student sdu: my_list){
				if(idx == 1){
					ans = Math.max(ans, sdu.englishScore);
				}
				else if(idx == 2){
					ans = Math.max(ans, sdu.hindiScore);
				}
				else if(idx == 3){
					ans = Math.max(ans, sdu.mathsScore);
				}
				else if(idx == 4){
					ans = Math.max(ans, sdu.scienceScore);
				}
				else if(idx == 5){
					ans = Math.max(ans, sdu.ssScore);
				}
			}

			for(Student sdu: my_list){
				if(idx == 1 && sdu.englishScore == ans){
					System.out.println(sdu.studentName+" "+sdu.rollNo);
				}
				else if(idx == 2 && sdu.hindiScore == ans){
					System.out.println(sdu.studentName+" "+sdu.rollNo);
				}
				else if(idx == 3 && sdu.mathsScore == ans){
				    System.out.println(sdu.studentName+" "+sdu.rollNo);
				}
				else if(idx == 4 && sdu.scienceScore == ans){
					System.out.println(sdu.studentName+" "+sdu.rollNo);
				}
				else if(idx == 5 && sdu.ssScore == ans){
					System.out.println(sdu.studentName+" "+sdu.rollNo);
				}
			}
		}

		public void classTopper(){
			int max_marks = 0;
			for(Student sdu: my_list){
				int tmp_marks = (sdu.englishScore+sdu.hindiScore+sdu.mathsScore+sdu.scienceScore+sdu.scienceScore+sdu.ssScore);
				max_marks = Math.max(max_marks, tmp_marks);
			}
			for(Student sdu: my_list){
				if(max_marks == (sdu.englishScore+sdu.hindiScore+sdu.mathsScore+sdu.scienceScore+sdu.scienceScore+sdu.ssScore)){
					System.out.println(sdu.studentName+" "+sdu.rollNo);
				}
			}
		}
	}
}
