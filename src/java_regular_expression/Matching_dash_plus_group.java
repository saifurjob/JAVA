
package java_regular_expression;

public class Matching_dash_plus_group
{
    public static void main(String[] args)
    {
        String s = "h";
        
        System.out.println("checks any charecters");
        String pattern3 = "[a-z]"; // checks any charecters
        System.out.println(s.matches(pattern3)); //true
        System.out.println("A".matches(pattern3)); //false
        System.out.println("2".matches(pattern3)); //false
        System.out.println("");
        
        System.out.println("hello".matches(pattern3)); //false
        System.out.println("HELLO".matches(pattern3)); //false
        System.out.println("222".matches(pattern3)); //false
        System.out.println("");
        
        System.out.println("hello".matches("[a-z]+")); //true
        System.out.println("HELLO".matches("[A-Z]+")); //true
        System.out.println("222".matches("[0-9]+")); //true
        System.out.println("");
        
        System.out.println("hello017".matches("[a-z]+")); //false
        System.out.println("HELLOasd".matches("[A-Z]+")); //false
        System.out.println("222aaa".matches("[0-9]+")); //false
        System.out.println("");
        
        System.out.println("helloHELLO".matches("[a-zA-Z]+")); //true
        System.out.println("HELLOasd".matches("[A-Z a-z]+")); //true
        System.out.println("222aaa".matches("[0-9a-z]+")); //true
        System.out.println("");
        
        System.out.println("555 hello HELLO".matches("[0-9 a-z A-Z]+")); //true
        System.out.println("".matches("[0-9 a-z A-Z]+")); //false
        System.out.println("".matches("[0-9 a-z A-Z]*")); //true
        System.out.println("");

        System.out.println("helloHELLO".matches("[ah]+")); //false
        System.out.println("he".matches("[he]+")); //true
        System.out.println("hehehe".matches("[he]+")); //true
        System.out.println("hehehe".matches("[he]*")); //true
        System.out.println("");
    }
}

//we know that 
// a* = ɛ,a,aa,aaa,aaaa,...............
// a+ = a,aa,aaa,aaaa,...............

// (ab)* = ɛ,ab,abab,ababab,abababab,...............
// a+ = ab,abab,ababab,abababab,...............