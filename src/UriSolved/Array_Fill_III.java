//URI 1178
package UriSolved;

import java.util.Scanner;

public class Array_Fill_III
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        double N[] = new double[100];
        double T = sc.nextDouble();
        for (int i = 0; i < N.length; i++) 
        {
            if(i>0)
            {
                N[i] = N[i-1]/2; 
                System.out.printf("N[%d] = %.4f\n",i, N[i]);
            }
            else 
            {
                N[i] = T;
                System.out.printf("N[%d] = %.4f\n",i, N[i]);
            }
                
        }
    }
}
