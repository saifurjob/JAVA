//URI 1158
package UriSolved;
import java.io.IOException;

import java.util.Scanner;

public class Sum_of_Consecutive_Odd_Numbers_3
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        
        for (int i = 0; i < inputs; i++) 
        {
            int sum = 0;
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            Calculation calculation = new Calculation(num1, num2);
            System.out.println(calculation.getCal());
        }
    }
}
class Calculation
{
    int num1, num2;
    Calculation(int num1, int num2) 
    {
        this.num1= num1;
        this.num2= num2;
    }

    public int getCal() 
    {
        int limit = num1+num2*2+1;
        int sum = 0;
        for (int i = num1; i < limit-1; i++) 
        {
            if(i%2==1)  sum+=i;
        }
        return sum;
    }
}