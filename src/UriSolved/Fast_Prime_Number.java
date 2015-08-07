//URI 1221
package UriSolved;

import java.util.Scanner;

public class Fast_Prime_Number
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int num;
        for (int i = 0; i<N; i++) 
        {
            num = sc.nextInt();
            Prime p = new Prime();
            int isPrime = p.isPrimeNumber(num);
            if(isPrime==1 && num>1)
                System.out.println("Prime");    
            else 
                System.out.println("Not Prime");    
        }
        
    }
}
class Prime
{
    public int isPrimeNumber(int number)
    {

        for(int i=2; i*i<=number/2; i++)
        {
            if(number % i == 0)
            {
                return 0;
            }
        }
        return 1;
    }
}
