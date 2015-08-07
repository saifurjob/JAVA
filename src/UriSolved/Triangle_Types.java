//URI 1045
package UriSolved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Triangle_Types
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        ArrayList<Double> arr = new ArrayList<Double>(3);
        arr.add(a);
        arr.add(b);
        arr.add(c);
        
        Collections.sort(arr);
        double A = arr.get(2),B = arr.get(1),C = arr.get(0);
        if(A >= B + C) System.out.println("NAO FORMA TRIANGULO");
        if(A*A == B*B + C*C) System.out.println("TRIANGULO RETANGULO");
        if(A*A > B*B + C*C) System.out.println("TRIANGULO OBTUSANGULO");
        if(A*A < B*B + C*C) System.out.println("TRIANGULO ACUTANGULO");
        if(A== B && B==C) System.out.println("TRIANGULO EQUILATERO");
        if((A==B && A!=C)||(B==C && B!=A)  || (A==C && A!=B)) System.out.println("TRIANGULO ISOSCELES");
    }
}
