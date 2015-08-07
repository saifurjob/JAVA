//URI 1159
package UriSolved;

import java.util.Scanner;

public class Sum_of_Consecutive_Even_Numbers
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int X;
        int sum;
        while((X=sc.nextInt())!=0) 
        {
            sum = 0;
            for (int j = X; j< X+2*5 ; j++) 
            {
                if(j%2==0)
                {
                    sum+=j;
                }
            }
            System.out.println(sum);
        }
        
    }
}
