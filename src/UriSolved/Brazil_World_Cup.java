//URI 1759
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Brazil_World_Cup
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            while (true) {                
                int a = sc.nextInt();
                if (a == 0) {
                    System.out.println("vai ter copa!");
                } else if (a > 0) {
                    System.out.println("vai ter duas!");
                }
            }
        } catch (NoSuchElementException e) {
        }
    }
}
