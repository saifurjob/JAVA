package Java_Basic.DataTypes;

public class Byte 
{

    public static void main(String[] args) 
    {
//        range -128 to 127

        byte var1 = 5;
        System.out.println(var1);
        
        byte var2 = (byte) 5.5;
        System.out.println(var2);
        
//        byte var3 = 128; //wrong because range -128 to 127
        byte var3 = 127; 
        System.out.println(var3);
        
    }
}
