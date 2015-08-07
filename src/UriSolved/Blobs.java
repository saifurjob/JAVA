//URI 1170
package UriSolved;

import java.util.Scanner;

public class Blobs
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) 
        {
            int count = 1;
            double input = sc.nextDouble();
            while (true) 
            {                
                if(input/2<=1.0)    break;
                input/=2;
                count++;
            }
            System.out.println(count+" dias");
        }
    }
}
