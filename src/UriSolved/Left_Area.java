//URI 1189
package UriSolved;

import java.util.Scanner;

public class Left_Area
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);
        double a = 0;
        double sum = 0;
        int count = 0;
        int length = 3;
        for (int i = 0; i<length; i++) 
        {
            for (int j = 0; j < length; j++) 
            {
                a = sc.nextDouble();
                if(((j<length-i-1)) && !(j>=i) ) 
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
