//URI 1257
package UriSolved;

import java.util.Scanner;

public class Array_Hash
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) 
        {
            int L = sc.nextInt();
            String s[] = new String[L];
            for (int j = 0; j < L; j++) 
            {
                s[j] = sc.next();
            }
            int Total = 0;
            for (int j = 0; j < L; j++) 
            {
                for (int k = 0; k < s[j].length(); k++) 
                {
                    Total = Total + (s[j].charAt(k)-65)+j+k;
                }
            }
            System.out.println(Total);
        }
    }
}
