package Java_Basic.DataTypes;

public class Short 
{

    public static void main(String[] args) 
    {
//        range -32768 to 32767

        short  var1 = 5;
        System.out.println(var1);
        
        short  var2 = (short) 1000.5;
        System.out.println(var2);
        
//        short var3 = 32768; //wrong because range -32768 to 32767
        short  var3 = 32767; 
        System.out.println(var3);
        
    }
}
