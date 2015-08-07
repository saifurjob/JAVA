//URI 1006
package UriSolved;

import java.util.Scanner;

public class Average_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        System.out.printf("MEDIA = %.1f\n", ((A * 2) + (B * 3) + (C * 5)) / (2+3+5));
    }
}
