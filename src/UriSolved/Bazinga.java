//URI 1828
package UriSolved;

import java.util.Scanner;

public class Bazinga
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) 
        {
            String s1 = sc.next().toLowerCase();
            String s2 = sc.next().toLowerCase();
            
            if((s1.equals("papel") || s1.equals("pedra"))  && (s2.equals("papel") || s2.equals("pedra")))
                System.out.println("Caso #"+i+": Bazinga!");
            else if((s1.equals("lagarto") || s1.equals("tesoura"))  && (s2.equals("lagarto") || s2.equals("tesoura")))
                System.out.println("Caso #"+i+": Raj trapaceou!");
            else if(s1.equals("Spock")  && s2.equals("Spock"))
                System.out.println("Caso #"+i+": De novo!");
        }
    }
}
