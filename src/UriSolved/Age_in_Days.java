//URI 1020
package UriSolved;

import java.util.Scanner;

public class Age_in_Days
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        
        int a, b, c;
        a=(int) (num/365);
        b = (int)((double)(num%365)/30);
        c=(int)((double)(num%365)%30);
        System.out.println(a+" ano(s)");
        System.out.println(b+" mes(es)");
        System.out.println(c+" dia(s)");
    }
}
