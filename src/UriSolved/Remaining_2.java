//URI 1075
package UriSolved;

import java.util.Scanner;

public class Remaining_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        
        for (int i = 1; i < 10000; i++) 
        {
            if(i%A==2)System.out.println(i);
        }
    }
}
