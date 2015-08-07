//URI 1182
package UriSolved;

import java.util.Scanner;

public class Column_in_Array
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int ColumnNum = sc.nextInt();
        char operation = sc.next().charAt(0);
        double a = 0;
        double sum = 0;

        for (int i = 0; i<12; i++) 
        {
            for (int j = 0; j < 12; j++) 
            {
                a = sc.nextDouble();
                if(i==ColumnNum)
                    sum+=a;
            }
        }
        if(operation=='S')
            System.out.printf("%.1f\n", sum);
        else if(operation=='M')
            System.out.printf("%.1f\n", sum/12);
            
    }
}
