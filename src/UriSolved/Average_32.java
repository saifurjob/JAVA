//URI 1006
package UriSolved;

import java.util.Scanner;

public class Average_32
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double Media, Total;
        
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();
        double a4 = sc.nextDouble();
        
        Total = a1*2.0+a2*3.0+a3*4.0+a4*1.0;
        Media = Total/10;
            System.out.printf("Media: %.1f\n", Media);
        if(Media>=7.0)
            System.out.printf("Aluno aprovado.\n");
        else if(Media<5.0)
            System.out.printf("Aluno reprovado.\n");
        else if(Media>=5.0)
        {
            System.out.printf("Aluno em exame.\n");
            double b = sc.nextDouble();
            double Media_final = (Media + b)/2;
            System.out.printf("Nota do exame: %.1f\n", b);
            
            if(Media_final>=5.0)
                System.out.printf("Aluno aprovado.\n");
            else
                System.out.printf("Aluno reprovado.\n");
            System.out.printf("Media final: %.1f\n", Media_final);
        }
    }
}
