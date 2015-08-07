//URI 1071		
package UriSolved;

import java.util.Scanner;

public class Sum_of_Consecutive_Odd_Numbers_I
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int li , lx;
        if(a<=b)
        {
            li = a;
            lx = b;
        }
        else 
        {
            li = b;
            lx = a;
        }
        int total = 0;
        for (int i = lx; i >li; i--) 
        {
            if(i%2==1 ||i%2==-1)
            {
                total += i;
            }
        }
        System.out.println(total);
    }
}
