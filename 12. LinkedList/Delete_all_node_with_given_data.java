class Solution {
    public ListNode deleteNodeWithGivenDataII(ListNode head, int data) {
                  ////LL has no nodes
                    if(head == null)
                    {
                        return null;
                    }
                  //If 1st node value matches,increment head pointer to next
                    if(head.val == data)
                    {
                        head = head.next;
                    }
                  //Pointing to head
                    ListNode current = head;
                    //Pointing to null
                    ListNode prev = null;
            
                    while(current.next != null)
                    {   
                        //Prev at current last node   
                        prev = current;
                        //Incrementing Current
                        current = current.next;
                        //If Value Matches
                        if(data == current.val)
                        {   
                            //Just link the node previous to deleted and the one Next to deleted node
                            prev.next = current.next;
                        }    
                    }
        return head;
    }
}
