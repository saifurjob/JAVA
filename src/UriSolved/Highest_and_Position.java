//URI  1080
package UriSolved;

import java.util.Scanner;

public class Highest_and_Position
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num[] =new int[100];
        for (int i = 0; i < 100; i++) 
        {
            num[i] = sc.nextInt();
        }

        int max = 1;
        int maxCount = 0;
        for (int i = 0; i < 100; i++) 
        {
            if(max<num[i])
            {
                max=num[i];
                maxCount = i;
            }
        }
        System.out.println(max);
        System.out.println(maxCount+1);
        
    }
}
