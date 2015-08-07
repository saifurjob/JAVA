//URI 1133
package UriSolved;

import java.util.Scanner;

 
public class Rest_of_a_Division
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
         
        for (int i = min+1; i < max; i++) 
        {
            if(i%5==2 || i%5==3 )
                System.out.println(i);
        }
    }
}