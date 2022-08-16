import java.util.*;

class Q5
{
    public static void main(String[] s)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i = 0 ; i < n; i++)    
        {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++)
         {     
            for (int j = i+1; j < arr.length; j++)
            {     
               if(arr[i] < arr[j])
               {    
                   int temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }              
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }
        sc.close();    
    }
}
