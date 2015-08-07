//URI 1064		
package UriSolved;

import java.util.Scanner;

public class Positives_and_Average
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double num1=0.0;
        double num2;
        for (int i = 0; i < 6; i++) 
        {
            
            num2 = sc.nextDouble();
            if(num2>=0)
            {
                num1 = num2+num1;
                count++;
            }
        }
        System.out.println(count+" valores positivos");
        num1 = num1/count;
        System.out.printf("%.1f\n",num1);
    }
}
