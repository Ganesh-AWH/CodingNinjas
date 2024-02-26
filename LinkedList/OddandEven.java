/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/
import java.util.*;
public class Solution
{
    public static Node segregateEvenOdd(Node head)
    {
        // Write Your Code Here.

        //Naive approach
        Node temp = head;
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        while(temp !=null){
            if(temp.data%2==0) even.add(temp.data);
            else odd.add(temp.data);
            temp = temp.next;
        }

        temp = head;
        for(int i:even){
            temp.data = i;
            temp = temp.next;
        }

        for(int i:odd){
            temp.data = i;
            temp = temp.next;
        }

        return head;
    }
}