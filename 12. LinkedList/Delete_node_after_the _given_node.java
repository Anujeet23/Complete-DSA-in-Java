class Solution {
    public ListNode deleteNodeAfterTheGivenNode(ListNode head, ListNode node) 
    {       
        //If LL dosen't exist what wll you delete ?
            if(head == null)
            {
                return head;
            }
        //If only one node is there in LL
            if(head == node && head.next == null)
            {   
                head.next = null;
                return head;
            }
            
            //If Node is at the end , The it  will print whole LL
            if(node.next == null)
            {
                return head;
            }   

            //Current is pointintg to head 
            ListNode current = head;
            
            //Traversing current till we reach node 
            while(current != node.next)
            {   
                //Incrementing current node
                current = current.next;
            }
            //Once current reached node then
            //Linking node and current's next node 
            node.next = current.next;
            //Deleting node after mentioned node.
            current = null;
        return head;
    }
}
