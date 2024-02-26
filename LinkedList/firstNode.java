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
    public static Node firstNode(Node head) {
        // Write your code here.

        //tortoise and hare approach
        Node tortoise = head;
        Node hare = head;

        //first find the collision is there are not
        while(hare != null && hare.next!=null){
            tortoise = tortoise.next;
            hare = hare.next.next;
            if(tortoise == hare){
                break;
            }
        }
        //since there is no collision
            if(hare==null) return null;
            tortoise = head;
            while(tortoise != hare){
                tortoise = tortoise.next;
                hare = hare.next;
            }
            return tortoise;

        
    }
}