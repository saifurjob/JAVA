//URI 1067		
package UriSolved;

import java.util.Scanner;

public class Odd_Numbers
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) 
        {
            if(i%2==1)System.out.println(i);
        }
    }
}
