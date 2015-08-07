//URI 1154
package UriSolved;

import java.util.Scanner;

public class Ages
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int age ;
        double sum = 0;
        int count = 0;
        for (int i = 0; i>=0; i++) 
        {
            age =sc.nextInt();
            if(age<0)
                break;
            sum+=age;
            count++;
        }
        
        System.out.printf("%.2f\n",sum/count);
    }
}
