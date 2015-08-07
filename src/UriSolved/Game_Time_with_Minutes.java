//URI 1047
package UriSolved;

import java.util.Scanner;

public class Game_Time_with_Minutes
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int hi = sc.nextInt();
        int mi = sc.nextInt();
        int hl = sc.nextInt();
        int ml = sc.nextInt();
        
        int H = 0;
        if(24-hi+hl<=24)
            H = 24-hi+hl;
        else
            H = Math.abs(hi-hl);
        
        int M = 0;
        if(60-mi+ml<=60)
            M = 60-mi+ml;
        else
            M = Math.abs(mi-ml);
            
        int T = 0;
        if(H*60 + M<=1440)
            T = H*60 + M;
        else
            T = 1440;
        if(60-mi+ml<60)
            T=T-60;
        int HF = T/60;
        int MF = T%60;
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", HF, MF);
        
    }
}
