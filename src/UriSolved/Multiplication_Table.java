//URI 1078		
package UriSolved;

import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(i +" x "+ a +" = "+i*a);
        }
    }
}
