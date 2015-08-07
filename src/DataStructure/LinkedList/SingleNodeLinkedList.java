
package DataStructure.LinkedList;


public class SingleNodeLinkedList 
{
    public static void main(String[] args) 
    {
        Nodes front = new Nodes(25, null);
        System.out.println(front);
    }
}
class Nodes
{
    int data;
    Nodes nextNode;

    public Nodes(int data, Nodes nextNode) 
    {
        this.data = data;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() 
    {
        return data+"";
    }
}
