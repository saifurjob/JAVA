//URI 1157
package UriSolved;

import java.util.Scanner;

public class Divisors_I
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        
        for (int i = 1; i<=N; i++) 
        {
            if(N%i==0)
                System.out.println(i);
        }
        
    }
}
