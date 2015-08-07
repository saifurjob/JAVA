//URI 1065		
package UriSolved;

import java.util.Scanner;

public class Even_Between_five_Numbers
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num;
        for (int i = 0; i < 5; i++) 
        {
            
            num = sc.nextInt();
            if(num%2==0)
            {
                count++;
            }
        }
        System.out.println(count+" valores pares");
    }
}
