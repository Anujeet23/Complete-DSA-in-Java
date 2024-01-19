class Solution {
    public int lengthOfTheLinkedList(ListNode head) {\
        //Assigning head to current which is new node
        ListNode current = head;
        //Initialising len to 0
        int len = 0;
        
        //Traversing whole LL until null is encountered
        while(current != null)
        {   
            //Incremententing Length
            ++len;
            //Updating current pointers value to the next node
            current = current.next;
        }
        //Returning the length of LL
        return len;
    }
}
