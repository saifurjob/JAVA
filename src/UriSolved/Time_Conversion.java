//URI 1019
package UriSolved;

import java.util.Scanner;

public class Time_Conversion
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        
        int a, b, c;
        a=(int) (num/3600);
        b = (int)((double)(num%3600)/60);
        c=(int) (num%60);
        System.out.println(a+":"+b+":"+c);
    }
}
