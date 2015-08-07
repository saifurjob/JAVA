//URI 1149
package UriSolved;

import java.util.Scanner;

public class Summing_Consecutive_Integers
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        int n = 0;
        while(true) 
        {
            n=sc.nextInt();
            for (int i = 0; i < n; i++) 
            {
                sum +=a;
                a++;    
            }
            if(n>0)break;
        }
        
        System.out.println(sum);
    }
}
