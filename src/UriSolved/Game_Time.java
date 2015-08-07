//URI 1046
package UriSolved;

import java.util.Scanner;

public class Game_Time
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int X = (24-x)+y;
        if((24-x)+y<=24)X=(24-x)+y;
        else
            X = Math.abs(x-y);
        System.out.printf("O JOGO DUROU %d HORA(S)\n", X);
        
    }
}
