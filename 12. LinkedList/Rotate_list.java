class Solution {
    public ListNode rotateListToRight(ListNode head, int K) {
        
           //If LL dosen't exist then what will you rotate bro ?
            if(head == null)
            {
                return head;
            }
           //For LL with length one and we are rotating it.
            if(head.next == null && k>=1)
            {
                return head;
            }
           //Initializing i track of rotations
            int i=0;
            while(i < K)
            {  
             //Current is pointing to the head ot LL
                ListNode current = head;
                //Prev is pointing to null
                ListNode prev = null;
                while(current.next != null)
                {     
                    //For pointing to currents previous node
                        prev = current;
                    //Incrementing Current 
                        current = current.next; 
                }
                //Pointing last node of LL to head
                current.next = head;
                //Now head should be pointinh to current node
                head = current;
                //Last node which was current's previous should be null 
                prev.next = null;
                //Inccrementing Rotation track
                i++;
            }
        return head;
    }
}
