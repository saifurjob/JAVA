//URI 1020
package UriSolved;

import java.util.Scanner;

public class Bhaskara_Formula
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        if(a == 0 || (b*b-4*a*c)<0)
            System.out.println("Impossivel calcular");
        else
        {
            double R1 = ((-b+Math.sqrt(b*b-4*a*c))/(2*a));
            double R2 = ((-b-Math.sqrt(b*b-4*a*c))/(2*a));
            
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
