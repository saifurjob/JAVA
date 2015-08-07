//URI 1154
package UriSolved;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Event_Time
{
    public static void main(String[] args) throws Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Dia ");
            int d1 = sc.nextInt();
            System.out.println("");
            int h1 = sc.nextInt();
            System.out.print(" : ");
            int m1 = sc.nextInt();
            System.out.print(" : ");
            int s1 = sc.nextInt();
            System.out.println();
            
            System.out.print("Dia ");
            int d2 = sc.nextInt();
            int h2 = sc.nextInt();
            System.out.print(" : ");
            int m2 = sc.nextInt();
            System.out.print(" : ");
            int s2 = sc.nextInt();
            
            int total1 = d1 * 24 * 3600 + h1 * 3600 + m1 * 60 + s1;            
            int total2 = d2 * 24 * 3600 + h2 * 3600 + m2 * 60 + s2;
            int total = total2 - total1;
            
            int d = (total / 24)/3600;
            System.out.println(d +" dia(s)");
            int h = (total-d*24*3600)/3600;
            System.out.println(h +" hora(s)");
            int m = (total-(d*24*3600+h*3600))/60;
            System.out.println(m +" minuto(s)");
            System.out.println(total % 60+" segundo(s)");
        } catch (InputMismatchException inputMismatchException) {
        }
    }
}
