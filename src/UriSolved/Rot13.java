//URI 1249
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Rot13
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String s;
        try {
            while ((s = sc.nextLine()) != null) {                
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isAlphabetic(s.charAt(i))) {
                        if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) && (s.charAt(i) + 13) > 90) {
                            System.out.printf("%c", 65 + 13 - (90 - s.charAt(i)) - 1);
                        } else if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) && (s.charAt(i) + 13) > 122) {
                            System.out.printf("%c", 97 + 13 - (122 - s.charAt(i)) - 1);
                        } else {
                            System.out.printf("%c", s.charAt(i) + 13);
                        }
                    } else {
                        System.out.printf("%c", s.charAt(i));
                    }
                    
                }
                System.out.println();
            }
        } catch (NoSuchElementException e) {
        }
    }
}
