//URI 1010
package UriSolved;

import java.util.Scanner;

public class Simple_Calculate1
{
    public static void main(String[] args) throws Exception
    {
        double a[] = new double[3];
        double b[] = new double[3];
        
        Scanner sc = new Scanner(System.in);
        double totalA = 0;
        double totalB = 0;
        for (int i = 0; i < 3; i++) 
        {
            a[i] = sc.nextDouble();
            if(i==2)
            {
                totalA = a[1]*a[2];
            }
        }
        for (int i = 0; i < 3; i++) 
        {
            b[i] = sc.nextDouble();
            if(i==2)
            {
                totalB = b[1]*b[2];
            }
        }
        System.out.printf("%.2f\n",totalA+totalB);
    }
}
