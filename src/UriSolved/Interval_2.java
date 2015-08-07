//URI 1072
package UriSolved;

import java.util.Scanner;

public class Interval_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        
        int inCnt=0;
        int outCnt=0;
        
        int num;
        
        for(int i=0; i<inputs; i++)
        {
            num=sc.nextInt();
            if(num>=10 && num<=20)inCnt++;
            else outCnt++;
        }
        
        System.out.println(inCnt+" in");
        System.out.println(outCnt+" out");
    }
}
