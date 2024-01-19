class Solution {
    public ListNode moveTheLastNodeToTheStart(ListNode head) {
           //If LL dosen't exist.
            if(head == null)
            {
                return head;
            }
            
            //Pointing to head of LL
            ListNode current = head;
            //Pointing to null
            ListNode prev = null;

            //Traversing until we reach last node of LL
            while(current.next != null)
            {   
                //USed to point the previous node to current
                prev = current;
                //Incrementing Current pointer
                current = current.next;
            }
            //Pointing Last node to the head of the LL
            current.next = head;
            //Then as our 1st node is current it should be head too ...
            head = current;
            //Pointing Last node to null
            prev.next = null;
        return head;
    }
}
