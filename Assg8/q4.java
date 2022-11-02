import java.io.*;
import java.lang.*;
import java.util.*;
public class q4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		int len = inp.length();
		if(len % 8 != 0)
		{
		    System.out.println("Incorrect Input");
		    return;
		}
		int j = 0;
		int k = 0;
		int first = 0;
		int firstone = 0;
		for(int i = 0; i < len; i++)
		{
		    k++;
		    if(k == 8)
		    {
		        k = 0;
		        String p = inp.substring(j, i+1);
		        int n = Integer.parseInt(p, 2);
		        j = i+1;
		        if(first == 1)
		        {
		            int z = n ^ firstone;
		            char ch = (char)z;
		            System.out.print(ch);
		        }
		        if(first == 0)
		        {
		            first = 1;
		            firstone = n;
		        }
		    }
		}
	}
}
