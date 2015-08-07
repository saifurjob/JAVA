//URI 1042
package UriSolved;

import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a+b>c && b+c>a && a+c>b)
        {
            double perimetro = a+b+c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else
        {
            double Area =  (((a+b)/2)*c);
            System.out.printf("Area = %.1f\n", Area);
        }
    
    }
}
