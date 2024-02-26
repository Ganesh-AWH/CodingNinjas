/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

 public class Solution
 {
     public static Node removeKthNode(Node head, int K)
     {
         // Write your code here.
 
         //Brute force approach
         Node temp = head;
         int count = 0;
         while(temp != null){
             temp = temp.next;
             count++;
         }
         if(count == K) return head.next;
         temp = head;
         for(int i=1;i<count-K;i++){
             temp = temp.next;
         }
         Node delNode = temp.next;
         temp.next = temp.next.next;
         delNode = null;
         return head;
     }
 }