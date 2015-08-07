//URI 1156
package UriSolved;

import java.util.Scanner;

public class S_Sequence_II
{
    public static void main(String[] args) throws Exception
    {
        double s = 0;
        double devider = 1;
        for (int i = 1; i <= 39; i+=2) 
        {
            s += ((double)i)/devider;
            devider=devider*2;
        }
        System.out.printf("%.2f\n", s);
    }
}
