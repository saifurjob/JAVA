//URI 1044
package UriSolved;

import java.util.Scanner;

public class Multiples
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a%b==0 || b%a==0)System.out.println("Sao Multiplos");
        else System.out.println("Nao sao Multiplos");
    }
}
