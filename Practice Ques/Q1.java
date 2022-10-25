import java.util.*;

class IntArray {
	int[] vals;
	int length;
	IntArray(int maxLength){
		vals = new int[maxLength];
		length = 0;
	}

	boolean insert(int x){
		if(length == vals.length){
			System.out.println("The Array is full");
			return false;
		}
		vals[length] = x;
		++length;
		return true;
	}
}

class SortedIntArray extends IntArray {

	SortedIntArray(int maxLength){
		super(maxLength);
	}

	boolean sortAndAdd(int x){
		if(length == vals.length){
			System.out.println("The Array is full");
			return false;
		}
		Arrays.sort(this.vals, 0, this.length);
		int i;
		for(i = 0; i < length; ++i){
			if(vals[i] > x)
				break;
		}
		int temp = x;
		for(; i < length; ++i){
			int temp2;
			temp2 = vals[i];
			vals[i] = temp;
			temp = temp2;
		}
		vals[length] = temp;
		++length;
		return true;
	}
}

public class Q1{
	public static void main(String[] args){
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");

		n = scanner.nextInt();
		SortedIntArray arr = new SortedIntArray(n);

		System.out.println("1. Add element to list 2. Add to sorted list 3. Exit");
		while(true){
			System.out.print("Enter your choice: ");
			int ch = scanner.nextInt();
			if(ch == 3){
				break;
			}
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();
			boolean success = false;
			if(ch == 1){
				success = arr.insert(num);
			} else if (ch == 2){
				success = arr.sortAndAdd(num);
			}
			if(success){
				for(int j = 0; j < arr.length; ++j){
					System.out.print(arr.vals[j] + " ");
				}
				System.out.println();
			}
		}

	}
}