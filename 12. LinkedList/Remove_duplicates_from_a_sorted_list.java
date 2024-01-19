class Solution {
    public ListNode removeDuplicatesFromASortedList(ListNode head) {
           //LL has no nodes
            if(head == null)
            {
                return head;
            }
        

            ListNode current = head;
            while(current != null && current.next != null)
            { 
                //If value is matching
                if(current.val == current.next.val)
                {  
                    //Create a link
                    current.next = current.next.next;
                }
                else
                {  
                    //Increment current
                    current = current.next;
                }
            } 
        
    return head;
    }
}
