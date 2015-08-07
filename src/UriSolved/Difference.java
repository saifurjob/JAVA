//URI 1007
package UriSolved;

import java.util.Scanner;

public class Difference
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        System.out.printf("DIFERENCA = %d\n", (A * B - C * D));
    }
}
