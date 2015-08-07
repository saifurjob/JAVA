
package DataStructure.LinkedList;


public class MultipleNodeLinkedList 
{
    public static void main(String[] args) 
    {
        String[] names = {"saifur", "Rimi", "Ridoy", "Riaz", "Ripu", "Topu"};
        int[] roll = {1, 2 , 3, 4, 5, 6};
        MulNodes mulNodes ;
        for (int i = 0; i < 6; i++) 
        {
            mulNodes = new MulNodes(names[i], roll[i], null);
            System.out.println(mulNodes);
        }
    }
}
class MulNodes
{
    String name;
    int roll;
    MulNodes nextNodes;

    public MulNodes(String name, int roll, MulNodes nextNodes) 
    {
        this.name = name;
        this.roll = roll;
        this.nextNodes = nextNodes;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", roll=" + roll;
    }
    
    
}
