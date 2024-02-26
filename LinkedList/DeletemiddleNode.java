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
 };

 *****************************************************************/

 public class Solution {
    public static Node deleteMiddle(Node head) {
        // Write your code here.

        //find the middle node
        Node tortoise = head;
        Node hare = head;
        Node prev = null;
        while(hare!=null && hare.next!=null){
            prev = tortoise;
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        //tortoise pointing in the middle node
        if(prev==null || prev.next==null) return null;

        prev.next = tortoise.next;
        tortoise = null;
        return head;
    }
}