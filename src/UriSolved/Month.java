//URI 1067		
package UriSolved;

import java.util.Scanner;

public class Month
{
    public static void main(String[] args) throws Exception
    {
        int ddd[] = {1,2,3,4,5,6,7,8,9,10,11, 12};
        String month[] = {"January", "February", "March", "April","May", "June", "July", "August", "September", "October", "November", "December"};
    
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < ddd.length; i++) 
        {
            if(a==ddd[i])
            {
                System.out.println(month[i]);
                break;
            }
        }

    }
    
}
