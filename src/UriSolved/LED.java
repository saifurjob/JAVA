//URI 1168
package UriSolved;

import java.util.Scanner;

public class LED
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int scanNum = sc.nextInt();
        for (int i = 0; i<scanNum; i++) 
        {
            int sum = 0;
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) 
            {
                switch(Integer.parseInt(s.charAt(j)+""))
                {
                    case 0:
                        sum+=6;
                        break;
                    case 1:
                        sum+=2;
                        break;
                    case 2:
                        sum+=5;
                        break;
                    case 3:
                        sum+=5;
                        break;
                    case 4:
                        sum+=4;
                        break;
                    case 5:
                        sum+=5;
                        break;
                    case 6:
                        sum+=6;
                        break;
                    case 7:
                        sum+=3;
                        break;
                    case 8:
                        sum+=7;
                        break;
                    case 9:
                        sum+=6;
                        break;
                }
            }
            
            System.out.println(sum+" leds");
        }
        
    }
}
