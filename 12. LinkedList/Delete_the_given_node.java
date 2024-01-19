class Solution {
    public ListNode deleteTheGivenNode(ListNode head, ListNode node) {
         //LL has no nodes
                if(head == null)
                {
                    return head;
                }
        
           //If LL has only one node then delete it.
                if(head == node)
                {
                    head = null;
                    return head;  
                }
        
          //Current is pointintg to head 
            ListNode current = head;
          //Prev is pointing to null
            ListNode prev = null;
        
          //Traverse until we reach on desired node
                while(current != node)
                {   
                    //Prev at current last node 
                    prev = current;
                    //Incrementing Current
                    current = current.next;
                }
           //Creating link between prev  node and next node to current node.
           //As we are deleting current node.
            prev.next = current.next;
           //Deleting desired node. 
            current = null;
        return head;
    }
}
