//URI 1176
package UriSolved;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Fibonacci_Array
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int arr[] = new int[cases];
        int arr1[] = new int[cases];
        for (int i = 0; i < cases; i++) {
            arr[i] = sc.nextInt();
            arr1[i] = arr[i];
            
        }
        Arrays.sort(arr1);
        
        
        int N = arr1[arr1.length-1];
        int fibo[] = new int[N];
        try 
        {
            for (int i = 0; i < N; i++) 
            {
                if(i==0)   fibo[0]=0;
                else if (i==1)  fibo[1]=1;
                else
                    fibo[i] = fibo[i - 2] + fibo[i - 1];
            }
            
            int num;
            System.out.println("cases = "+cases);
            for (int i = 0; i < cases; i++) 
            {
                num = arr[i];
                System.out.println("Fib(" + num + ") = " + fibo[num]);
                System.out.println(i);
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}
