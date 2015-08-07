//URI  1094

package UriSolved;

import java.util.Scanner;

public class Experiments	
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        
        int cobaias[] = new int[caseNum];
        char typeAnimal[]= new char[caseNum];
        String typeAnimals[]= new String[caseNum];
        
        int cobaiasTotal = 0;
        int CTotal=0, RTotal=0, STotal=0;
        double CPercent=0, RPercent=0, SPercent=0;
        
        for (int i = 0; i < caseNum; i++) 
        {
            cobaias[i] = sc.nextInt();
            typeAnimals[i] = sc.next();
            typeAnimal[i] = typeAnimals[i].charAt(0);
            
            cobaiasTotal+=cobaias[i];
            if(typeAnimal[i]=='C')CTotal+=cobaias[i];
            if(typeAnimal[i]=='R')RTotal+=cobaias[i];
            if(typeAnimal[i]=='S')STotal+=cobaias[i];
        }
        
        
        System.out.println("Total: "+ cobaiasTotal +" cobaias");
        System.out.println("Total de coelhos: "+ CTotal);
        System.out.println("Total de ratos: "+ RTotal);
        System.out.println("Total de sapos: "+ STotal);
        
        CPercent = (double) (CTotal*100.00)/cobaiasTotal;
        RPercent =(double)  (RTotal*100.00)/cobaiasTotal;
        SPercent =(double)  (STotal*100.00)/cobaiasTotal;
        
        System.out.printf("Percentual de coelhos: %.2f ", CPercent);
        System.out.println("%");
        System.out.printf("Percentual de ratos: %.2f ", RPercent);
        System.out.println("%");
        System.out.printf("Percentual de sapos: %.2f ", SPercent);
        System.out.println("%");
        
    }
}
