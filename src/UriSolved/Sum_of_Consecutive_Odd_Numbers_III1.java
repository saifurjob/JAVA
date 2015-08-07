//URI 1158 
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Sum_of_Consecutive_Odd_Numbers_III1
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
                if(X%2==0)
                    sum += X+1;
                else
                    sum = X;
                
                int temp = sum;
                for (int j = 0; j<Y-1 ; j++) 
                {
                    temp+=2;
                    sum+= temp;
                }
                System.out.println(sum);
            }
        } catch (NoSuchElementException e) {
        }
        
    }
}
