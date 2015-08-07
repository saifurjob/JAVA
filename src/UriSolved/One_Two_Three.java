//URI 1154
package UriSolved;

import java.util.Scanner;

public class One_Two_Three
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int l=0;
        while (l<input) 
        {   
            String s = sc.next();
            if(s.length()==3 && s.toLowerCase().contains("e")) System.out.println(1);
            else if(s.length()==3 && s.toLowerCase().contains("t")) System.out.println(2);
            else if(s.length()==5 && s.toLowerCase().contains("t")) System.out.println(3);
            else if(s.length()==4 && s.toLowerCase().contains("r")) System.out.println(4);
            else if(s.length()==4 && s.toLowerCase().contains("e")) System.out.println(5);
            else if(s.length()==3 && s.toLowerCase().contains("s")) System.out.println(6);
            else if(s.length()==5 && s.toLowerCase().contains("s")) System.out.println(7);
            else if(s.length()==5 && s.toLowerCase().contains("e")) System.out.println(8);
            else if(s.length()==4 && s.toLowerCase().contains("n")) System.out.println(9);
            l++;
        }
    }
}
