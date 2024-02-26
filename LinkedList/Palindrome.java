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
    public static boolean isPalindrome(Node head) {
        // write your code here

        // reverse the n/2 nodes in the linked list

        Node tortoise = head;
        Node hare = head;
        while(hare.next!=null && hare.next.next!=null){
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        Node newHead = reverse(tortoise.next);
        Node first = head;
        Node second = newHead;
        while(second != null){
            if(first.data != second.data){
                reverse(newHead);
                return false;
            }
            second = second.next;
            first = first.next;
        }
        reverse(newHead);
        return true;
    }
    private static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
