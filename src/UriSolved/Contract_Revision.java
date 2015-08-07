//URI 1120
package UriSolved;

import java.util.Scanner;

public class Contract_Revision
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a;
        String b = "";
        try {
            while (true) 
            {                
                if((a = sc.nextInt()) == 0 && (Integer.parseInt(b = sc.next().trim())) == 0)
                    break;
                String s = b;
                for (int i = 0; i < s.length(); i++) {
                    if (Integer.parseInt(s.charAt(i) + "") == a) {
                        continue;
                    } else if (i > 0 && s.charAt(i - 1) == '0' && s.charAt(i) == '0') {
                        continue;
                    } else {
                        System.out.print(s.charAt(i));
                    }
                }
                System.out.println();
            }
        } catch (Exception numberFormatException) {
        }
            
    }
}
