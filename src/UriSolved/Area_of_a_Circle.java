//URI 1002
package UriSolved;

import java.util.Scanner;

public class Area_of_a_Circle 
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        System.out.printf("A=%.4f", 3.14159*R*R);
    }
}
