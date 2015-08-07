//URI 1154
package UriSolved;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Alarm_Clock
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int h1, h2, m1, m2, tm1, tm2, tm;
        try {
            while (true) {                
                h1 = sc.nextInt();
                m1 = sc.nextInt();
                h2 = sc.nextInt();
                m2 = sc.nextInt();
                if (h1 == 0 && h2 == 0 && m1 == 0 && m2 == 0) {
                    break;
                }
                
                tm1 = h1 * 60 + m1;
                tm2 = h2 * 60 + m2;
                tm = tm2 - tm1;
                if (tm1 < tm2) {
                    System.out.println(tm);
                } else {
                    System.out.println(24 * 60 - tm1 + tm2);
                }
                
            }
        } catch (InputMismatchException e) {
        }
    }
}
