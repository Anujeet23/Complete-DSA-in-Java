class Solution {
    public ListNode deleteNodeAtADistanceXFromTheStart(ListNode head,int X) 
    {       
            //LL has no nodes
            if(head == null)
            {
                return head;
            }
            //If we have to delete node at index 0 then
            //Just increment head.
            if(X == 0)
            {
                head = head.next;
                return head;
            }
            //Pointing to head
            ListNode current = head;
            //Pointing to null
            ListNode prev = null;
            //index pointer
            int i = 0;

            while(i <= X-1 && current.next != null)
            {   
                //Prev at current last node  
                prev = current;
                //Incrementing Current
                current = current.next;
                //Incrementing index of LL
                // NOTE LL Does not have indexes it's just for our understanding purpose.
                i++;
            }
            //If given index is out of bound then
            //print LL as it is.
            if(X > i)
            {
                return head;
            }

            //Link between the node previous to deleted one and the next one to the deleted one
            prev.next = current.next;
            //Deleting node
            current = null;
        return head;    
    }
}
