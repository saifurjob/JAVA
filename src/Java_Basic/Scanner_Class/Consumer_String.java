
package Java_Basic.Scanner_Class;

import java.util.Scanner;

public class Consumer_String 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur name : ");
        String s1 = sc.nextLine();
        System.out.println("Enter ur age : ");
        int a1 = sc.nextInt();
        System.out.println("name : "+ s1);
        System.out.println("age : "+ a1);
        
//        consumer String
        sc.nextLine();
        
        System.out.println("Enter ur name : ");
        String s2 = sc.nextLine();
        System.out.println("Enter ur age : ");
        int a2= sc.nextInt();
        System.out.println("name : "+ s2);
        System.out.println("age : "+ a2);
        
    }
}
