//URI 10012
package UriSolved;

import java.util.Scanner;

public class Area_1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        Area area = new Area(A, B, C);
        
        System.out.printf("TRIANGULO: %.3f\n", area.getRectangled_triangle());
        System.out.printf("CIRCULO: %.3f\n", area.getArea_of_the_Circle());
        System.out.printf("TRAPEZIO: %.3f\n", area.getArea_of_Trapezium());
        System.out.printf("QUADRADO: %.3f\n", area.getArea_of_Square());
        System.out.printf("RETANGULO: %.3f\n", area.getArea_of_Rectangle());
    }
}

class Area
{

    double A, B, C;

    public Area(double A, double B, double C) 
    {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
//  (a)
    public double getRectangled_triangle() 
    {
        double base = A;
        double height = C;
        return (1.0/2.0)*A*C;
    }
    
//  (b)
    public double getArea_of_the_Circle() 
    {
        double radius = C;
        return 3.14159*C*C;
    }
    
//  (c)
    public double getArea_of_Trapezium() 
    {
        double base1 = A;
        double base2 = B;
        double height = C;
        
        return ((A+B)/2.0)*C;
    }
    
//  (d)
    public double getArea_of_Square() 
    {
        double side = B;
        
        return side*side;
    }
    
//  (e)
    public double getArea_of_Rectangle() 
    {
        double side1 = A;
        double side2 = B;
        
        return side1*side2;
    }
    
    
    
}