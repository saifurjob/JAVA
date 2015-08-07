//URI  1070

package UriSolved;

import java.util.Scanner;

public class Six_Odd_Numbers	
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i <= num+12; i++) 
        {
            if(i%2==1)System.out.println(i);
        }
    }
}
