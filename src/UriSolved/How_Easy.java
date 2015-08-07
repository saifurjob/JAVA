//URI 1243
package UriSolved;

import java.util.Scanner;

public class How_Easy
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        while (true) 
        {            
            String s = sc.nextLine();
            String s1[] = s.split(" ");
            int i=0, sum =0;
            for (String sl1 : s1) 
            {
                
                sum += s1[i].length();
                i++;
            }
            int avg = sum/s1.length;
            if(avg<=3) System.out.println("250");
            else if(avg==4 ||avg==5 ) System.out.println("500");
            else if(avg>=6) System.out.println("1000");
                
        }
    }
}
