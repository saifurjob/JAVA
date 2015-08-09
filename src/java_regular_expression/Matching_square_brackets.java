
package java_regular_expression;

public class Matching_square_brackets
{
    public static void main(String[] args)
    {
        System.out.println("Check either a or e or both");
        System.out.println("a".matches("[ae]")); //true
        System.out.println("e".matches("[ae]")); //true
        System.out.println("e".matches("[^ae]")); //false
        System.out.println("s".matches("[ae]")); //false
        System.out.println("s".matches("[^ae]")); //true
        System.out.println("ae".matches("[ae]")); //false
        System.out.println("");

        System.out.println("ase".matches("[ae]+")); //false
        System.out.println("ase".matches("[a-z]")); //false
        System.out.println("ase".matches("[a-z]+")); //true
        System.out.println("ase".matches("[ae & a-z]+")); //true
        System.out.println("");
        
        System.out.println("1".matches("\\d")); //T
        System.out.println("ssss".matches("\\w")); //F 
        System.out.println(" ".matches("\\s")); //T
        System.out.println("");
        
        System.out.println("hello".matches("[a-zA-Z0-9]*")); //T
        System.out.println("h".matches("[a-zA-Z0-9 \\s ]")); //T
        System.out.println("hello WORLD 2015".matches("[a-zA-Z0-9 \\s ]")); //F
        System.out.println("hello WORLD 2015".matches("[a-zA-Z0-9 \\s ]*")); //T
        System.out.println("");
        
    }
}
