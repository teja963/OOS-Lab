import java.util.*;
import java.lang.*;
public class q1{
	public static void main(String[] s){
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String[] str = ip.split("\\,|\\[|\\]+");
		int len = str.length-1, updated_len = 1, count = 0;
		if(str.length == 0){
			len = 0;
			updated_len = 0;
		}
		for(int i = 1; i < str.length-1; i++){
			if(str[i].equals(str[i+1])){
				count++;
				if(count < 2)updated_len++;
			}
			else{
				count = 0;       
				updated_len++;
			}
		}
		System.out.println("Length of the array: "+len);
		System.out.println("After removing duplicates, the length of the array: "+updated_len);
	}
}


