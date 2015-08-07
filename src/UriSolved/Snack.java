//URI 1038
package UriSolved;

import java.util.Scanner;

public class Snack
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        double[] prices = {4.00, 4.50, 5.00, 2.00, 1.50};
        int codes = (int)X-1;
        System.out.printf("Total: R$ %.2f\n",prices[codes]*Y);
    }
}
