class Solution {
    public ListNode deleteTheLastNode(ListNode head) {
        //If LL dosen't Exists We don't have to delete anything
        if(head == null) 
        {
            return head;
        }
        //If there is only one node
        if(head.next == null)
        {   
            head = null;
            return null;
        }
        //Current is pointintg to head
        ListNode current = head;
        //Prev is for pointing previous current node. 
        ListNode prev = null; //Prev Currently pointing null

        
        while(current.next != null && current.next!= null)
        {    
            //Prev at current last node 
            prev = current;
            //Incrementing Current
            current = current.next;
        }
        
        //Deleting last node or we can say de-linking with ast node
        prev.next = null;
        //Making De-linked node as null
        current = null;

    return head; 
    }
}
