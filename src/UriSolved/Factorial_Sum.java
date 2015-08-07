//URI 1154
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Factorial_Sum
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            while (true) 
            {                
                long a = sc.nextLong();
                long b = sc.nextLong();
                long fact1 = 0, fact2 = 0;

                Factorial f = new Factorial(a);
                
                if(a==0)    fact1 = 1;
                else
                    fact1 = f.getA();
                
                f = new Factorial(b);
                if(b==0)    fact2 = 1;
                else
                    fact2 = f.getA();
                
                System.out.println(fact1+fact2);
            }
                
        } catch (NoSuchElementException e) {
        }
    }
}

class Factorial
{
    long a;

    public Factorial(long a) {
        this.a = a;
    }

    public long getA() 
    {
        long fact =1;
        for (int i = 1; i <= a; i++) 
        {
            fact*=i;
        }
        return fact;
    }
    
}