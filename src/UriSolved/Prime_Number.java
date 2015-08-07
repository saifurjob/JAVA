//URI 1165 
package UriSolved;

import java.util.Scanner;

public class Prime_Number
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int X;
        int sum;
        for (int i = 0; i<N; i++) 
        {
            X = sc.nextInt();
            
            int count = 0;
            for (int j = 1; j <= X; j++) 
            {
                if(X%j==0)
                    count++;
            }
                if(count==2)
                    System.out.println(X+" eh primo");
                else 
                    System.out.println(X+" nao eh primo");    
        }
        
    }
}
