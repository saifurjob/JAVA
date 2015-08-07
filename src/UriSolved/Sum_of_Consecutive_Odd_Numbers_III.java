//URI 1158 
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Sum_of_Consecutive_Odd_Numbers_III
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int X, Y;
        int sum;
        try 
        {
            for (int i = 0; i < N; i++) 
            {
                X = sc.nextInt();
                Y = sc.nextInt();
                sum = 0;
                for (int j = X; ; j++) 
                {
                    if(j >= X + 2 * Y) break;
                    if (j % 2 == 1)    sum += j;
                }
                System.out.println(sum);
            }
        } catch (NoSuchElementException e) {
        }
        
    }
}
