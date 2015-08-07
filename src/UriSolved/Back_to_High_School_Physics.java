//URI 1093
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Back_to_High_School_Physics
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int v, t;
        try {
            while (true) {
                v = sc.nextInt();
                t = sc.nextInt();
                
                System.out.println(v * t * 2);
            }
        } catch (NoSuchElementException e) {
        }
    }
}
