//URI 1037		
package UriSolved;

import java.util.Scanner;

public class Interval
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        if(input>=0.00 && input<=100.00)
        {
            if(input<=25.00)System.out.println("Intervalo [0,25]");
            else if(input>25.00 && input<=50.00)System.out.println("Intervalo (25,50]");
            else if(input>50.00 && input<=75.00)System.out.println("Intervalo (50,75]");
            else System.out.println("Intervalo (75,100]");
        }
        else System.out.println("Fora de intervalo");
    }
}
