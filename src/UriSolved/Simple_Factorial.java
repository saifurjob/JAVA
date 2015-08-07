//URI 1153
package UriSolved;

import java.util.Scanner;

public class Simple_Factorial
{
    public static void main(String[] args) throws Exception
    {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact = 1;
        
        for (int i = 1; i <= N; i++) 
        {
            fact*=i;
        }
        
        System.out.println(fact);
    }
}
