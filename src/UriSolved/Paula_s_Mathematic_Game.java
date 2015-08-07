//URI 1154
package UriSolved;

import java.util.Scanner;

public class Paula_s_Mathematic_Game
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        String s;
        for (int i = 0; i < cases; i++) 
        {
            s = sc.next();
            int a = Integer.parseInt(s.charAt(0)+"");
            int b = Integer.parseInt(s.charAt(2)+"");
            if(a==b)
                System.out.println(a*b);
            else if(s.charAt(1)>=65 && s.charAt(1)<=90)
                System.out.println(b-a);
            else if(s.charAt(1)>=97 && s.charAt(1)<=122)
                System.out.println(b+a);
                
        }
    }
}
