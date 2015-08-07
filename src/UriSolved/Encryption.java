//URI 1024
package UriSolved;

import java.util.Scanner;

public class Encryption
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int caseNum = sc.nextInt();
        String[] st = new String[caseNum];
        String tempSt;
        for (int i = 0; i < caseNum; i++) 
        {
            st[i] = sc.nextLine();
            st[i]=new StringBuilder(st[i]).reverse().toString();
            for (int j = 0; j < st[i].length(); j++) 
            {
                if( st[i].charAt(j)==' ')
                {
                    System.out.printf("%c", st[i].charAt(j));
//                    System.out.printf("1");
                }
                else if( st[i].contains("[A-Za-z]")==true)
                {
                    System.out.printf("%c", st[i].charAt(j));
//                    System.out.printf("2");
                }    
                else 
                {
                    System.out.printf("%c", st[i].charAt(j)+2);
//                    System.out.printf("3");
                }
//                if(st[i].charAt(j) == ' ' || st[i].contains("[A-Za-z]")==false)
            }
            System.out.println();
        }
    }
}
