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
     Node(int data)s
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

 public class Solution
 {
     public static Node reverseLinkedList(Node head)
     {
         // Write your code here.
         //approach using recursion
         if(head == null || head.next == null) return head;
         Node newHead = reverseLinkedList(head.next);
         Node front = head.next;
         front.next = head;
         head.next = null;
         return newHead;
     }
 }
 