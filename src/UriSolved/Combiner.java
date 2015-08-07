//URI 1253
package UriSolved;

import java.util.Scanner;

public class Combiner
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) 
        {
            String s[] = new String[N];
            for (int j = 0; j < 2; j++) 
            {
                s[j] = sc.next();
            }
            int max = 0; 
            int min = 0;
            
            if(s[0].length() > s[1].length()) 
            {
                max = s[0].length();
                min = s[1].length();
            }
            else 
            {
                max = s[1].length();
                min = s[0].length();
            }
            
            for (int j = 0; j < max; j++) 
            {
                if(j<min)
                {
                    System.out.print(s[0].charAt(j));
                    System.out.print(s[1].charAt(j));
                }
                else
                {
                    if(max == s[0].length())
                        System.out.print(s[0].charAt(j));
                    else
                        System.out.print(s[1].charAt(j));
                        
                }
            }
            System.out.println();    
        }
    }
}
