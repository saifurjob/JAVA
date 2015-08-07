//URI 1132
package UriSolved;

import java.util.Scanner;

public class Multiples_of_13
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int min = 0, max = 0;
        
        if(X<=Y)
        {
            min = X;
            max = Y;
        }
        else if(Y<X)
        {
            min = Y;
            max = X;
        }
        
        int sum = 0;
                
        for (int i = min; i <= max; i++) 
        {
            if(i%13!=0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
