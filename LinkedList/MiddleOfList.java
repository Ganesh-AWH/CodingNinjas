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

 public class Solution
 {
     public static Node findMiddle(Node head)
     {
         // Write your code here.
         // approach -2 tortoise rabbit problem
 
         Node tortoise = head;
         Node rabbit = head;
         while(rabbit!=null && rabbit.next!=null){
             tortoise = tortoise.next;
             rabbit = rabbit.next.next;
         }
         return tortoise;
     }
 }
