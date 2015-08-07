//URI 1184
package UriSolved;

import java.util.Scanner;

public class Below_the_Main_Diagonal
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);
        double a = 0;
        double sum = 0;
        int count = 0;

        for (int i = 0; i<12; i++) 
        {
            for (int j = 0; j < 12; j++) 
            {
                a = sc.nextDouble();
                if(i>j)
                {
                    sum+=a;
                    count++;
                }
            }
        }
        if(operation=='S')
            System.out.printf("%.1f\n", sum);
        else if(operation=='M')
            System.out.printf("%.1f\n", sum/count);
            
    }
}
