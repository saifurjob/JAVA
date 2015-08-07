//URI 1011
package UriSolved;

import java.util.Scanner;

public class Sphere_1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        Sphere sphere = new Sphere(radius);
        
        System.out.printf("VOLUME = %.3f\n", sphere.getVolume());
    }
}

class Sphere
{
    int radius;

    public Sphere(int radius) 
    {
        this.radius = radius;
    }

    public double getVolume() 
    {
        return (4.0/3.0)*3.14159*radius*radius*radius;
    }
}