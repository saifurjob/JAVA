
package DataStructure.Stack;

import java.util.Stack;

public class Stack_with_Stack_Class 
{
    public static void main(String[] args) throws Exception 
    {
        Stack<Integer> nums =  new Stack<Integer>();
        System.out.println(nums.push(2));
        System.out.println(nums.push(5));
        System.out.println(nums.push(7));
        
        System.out.println("peek = "+ nums.peek());
        System.out.println("lastElement  = "+  nums.indexOf(nums.lastElement()));
        System.out.println("firstElement  = "+  nums.indexOf(nums.firstElement()));
        System.out.println("search  = "+  nums.search(7));
        System.out.println("pop  = "+  nums.pop());
        
    }
}
