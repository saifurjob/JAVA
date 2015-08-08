
package java_regular_expression;

public class Matching_Dot_any_Character
{
    public static void main(String[] args)
    {
        String s = "hello world";
        
        System.out.println("checks any charecters");
        String pattern3 = "."; // checks any charecters
        System.out.println(s.matches(pattern3)); //false
        System.out.println("29".matches(pattern3)); //false
        System.out.println("".matches(pattern3)); //false
        System.out.println("");
        System.out.println(s.matches("h.e")); //false
        System.out.println(s.matches("h.l")); //false
        System.out.println(s.matches("h.o")); //false
        System.out.println("");
        System.out.println("hel".matches("h.l")); //true
        System.out.println("hdl".matches("h.l")); //true
        System.out.println("hfl".matches("h.l")); //true
        System.out.println("");
        System.out.println("hl".matches("h.l")); //false
        System.out.println("hel".matches("h..l")); //false
        System.out.println("heel".matches("h..l")); //true
        System.out.println("hdddl".matches("h...l")); //true
        System.out.println("");
        System.out.println("heel".matches("heel")); //true
        
        System.out.println("");
        
        System.out.println("checks 0 or more previous charecters");
        String pattern1 = ".*"; // checks 0 or more charecters
        System.out.println(s.matches(pattern1)); //true
        System.out.println("29".matches(pattern1)); //true
        System.out.println("".matches(pattern1)); //true
        
        System.out.println("");
        
        System.out.println("checks 1 or more previous charecters");
        String pattern2 = ".+"; // checks 1 or more charecters
        System.out.println(s.matches(pattern2)); //true
        System.out.println("29".matches(pattern2)); //true
        System.out.println("".matches(pattern2)); //false
        
    }
}
