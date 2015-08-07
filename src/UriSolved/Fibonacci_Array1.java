//URI 1176
package UriSolved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javafx.print.Collation;

public class Fibonacci_Array1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        try 
        {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            int n = 0;
            for (int i = 0; i < cases; i++) 
            {
                n = sc.nextInt();
                list.add(n);
            }
            list2.addAll(list);
            Collections.sort(list2);
            int max = list2.get(list2.size()-1);
            
            int fibo[] = new int[max];
            fibo[0] = 0;
            fibo[1] = 1;
            if(n>1)
            {
                for (int i = 2; i < max; i++) 
                {
                    fibo[i] = fibo[i-1]+fibo[i-2];
                }
                for (int i = 0; i < cases; i++) 
                {
                    n=list.get(i);
                    if (n == 0)
                    {
                        System.out.println("Fib(0) = 0");
                        continue;
                    }
                    else if (n == 1)
                    {
                        System.out.println("Fib(0) = 1");
                        continue;
                    }
                    else if (n > 1) 
                        System.out.println("Fib(" + list.get(i) + ") = " +fibo[list.get(i)]);
                }
            }

            
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }
}
