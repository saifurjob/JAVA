//URI 1164 
package UriSolved;

import java.util.Scanner;

public class Perfect_Number
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X;
        for (int i = 0; i < N; i++) 
        {
            X = sc.nextInt();
            int sum=0;
            for (int j = 1; j < X; j++) 
            {
                if(X%j==0)
                    sum+=j;
            }
            if(sum == X)
                System.out.println(X+" eh perfeito");
            else
                System.out.println(X+" nao eh perfeito");
        }
        
    }
}
