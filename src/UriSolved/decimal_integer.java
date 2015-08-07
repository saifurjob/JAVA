//URI 1154
package UriSolved;

import java.util.ArrayList;
import java.util.Scanner;

public class decimal_integer
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "";
        ArrayList<Integer> al = new ArrayList<>();
        while (true) 
        {   
            if(a/2<0)   break;
            al.add(a%2);
            a/=2;
        }
        System.out.println(al.clone());
    }
}
