//URI 1387
package UriSolved;

import java.util.Scanner;

public class Og
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while ((a=sc.nextInt())!=0 && (b=sc.nextInt())!=0) 
        {            
            int sum = a+b;
            System.out.println(sum);
        }
    }
}
