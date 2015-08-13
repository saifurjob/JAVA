package Junior_Programming_contest;

import java.util.Scanner;

public class Geometry
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 1; i <= cases; i++) 
        {
            long a,b,c;
            a =sc.nextInt();
            b =sc.nextInt();
            c =sc.nextInt();
            
            if(!((a+b)>c && (a+c)>b && (b+c)>a))
                System.out.println("Case "+i+": Invalid");
            else if(a==b && b==c && a==c)
                System.out.println("Case "+i+": Equilateral");
            else if(a==b || b==c || a==c)
                System.out.println("Case "+i+": Isosceles");
            else if(a!=b && b!=c && a!=c)
                System.out.println("Case "+i+": Scalene");
        }
    }
}
