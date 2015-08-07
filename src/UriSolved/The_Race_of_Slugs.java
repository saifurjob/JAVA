//URI 1789
package UriSolved;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class The_Race_of_Slugs
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            while (true) 
            {                
                int len = sc.nextInt();
                int speed ;
                int arr[] = new int[len];
                for (int i = 0; i < len; i++) 
                {
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                speed = arr[len-1];
                if(speed<10)
                    System.out.println(1);
                else if(speed>=10 && speed<20 )
                    System.out.println(2);
                else if(speed>=20 )
                    System.out.println(3);
            }
        } catch (NoSuchElementException e) {
        }
    }
}
