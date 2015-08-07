//URI 1240
package UriSolved;

import java.util.Scanner;

public class Fit_or_Dont_Fit_I
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
            for (int i = 0; i < cases; i++) 
            {
                String a = sc.next();
                String b = sc.next();
                if(b.length()>a.length())
                {
                    System.out.println("nao encaixa");
                    continue;
                }
                if(a.length()==b.length())
                {
                    System.out.println( "encaixa");
                    continue;
                }
                
                    if (a.substring(a.length() - b.length(), a.length()).equals(b)) {
                        System.out.println("encaixa");
                    } else {
                        System.out.println("nao encaixa");
                    }
            }
    }
}
