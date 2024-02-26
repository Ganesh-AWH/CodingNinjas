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

 public class Solution {

    public static boolean detectCycle(Node head) {
        //Your code goes here
        //fast pointer slow pointer approach
        Node tortoise = head;
        Node hare = head;
            //even length    odd length    
        while(hare!=null && hare.next !=null){
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise == hare) return true;
        }
        return false;
    }
}
