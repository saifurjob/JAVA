//URI 1151
package UriSolved;

import java.util.Scanner;

public class Easy_Fibonacci
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int prev = 0, cur = 1;
        int fib;
        System.out.print("0 1 ");
        for (int i = 1; i < num-1; i++) 
        {
            fib = cur+prev;
            if(i == num-2)
                System.out.print(fib);
            else
                System.out.print(fib+" ");
            prev = cur;
            cur = fib;
        }
        System.out.println();
    }
}
