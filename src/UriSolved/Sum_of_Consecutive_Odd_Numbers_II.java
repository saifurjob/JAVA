//URI  1099
package UriSolved;

import java.util.Scanner;

public class Sum_of_Consecutive_Odd_Numbers_II
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x, y;
        for (int i = 0; i<N; i++) 
        {
            x = sc.nextInt();
            y = sc.nextInt();
            int sum = 0;
            int min, max;
            
            if(x<y)
            {
                min = x;
                max = y;
            }
            else 
            {
                min = y;
                max = x;
            }
            if(min==max)
            {
                System.out.println(0);
                continue;
            }
            for (int j = min+1; j <max; j++) 
            {
                if(j%2==1)sum+=j;
            }
            System.out.println(sum);
        }

        
    }
}
