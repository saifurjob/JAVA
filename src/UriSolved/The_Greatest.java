//URI 1013
package UriSolved;

import static java.lang.Math.abs;
import java.util.Scanner;

public class The_Greatest
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        Greatest greatest = new Greatest(A, B, C);
        
        System.out.println(greatest.getMaior()+" eh o maior");
    }
}

class Greatest
{
    int A, B, C;

    public Greatest(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public int getMaior() 
    {
        int MaiorAB = (A+B+abs(A-B))/2;
        int maior = (MaiorAB+C+abs(MaiorAB-C))/2;
        return maior;
    }
    
}