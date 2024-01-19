class Solution {
    public ListNode deleteNodeWithGivenData(ListNode head, int data) {
            //If LL dosen't exist what wll you delete ?
            if(head == null)
            {
                return head;
            }
            //If there is only one node in LL and its equal to our value
            //Delete it Bro
            if(head.next == null && head.val == data)
            {
                head = null;
                return head;
            }
            //If 1 st node has same data and LL is not of size 1
            //Then Point head to next node, 1st will get automatically de-linked 
            if(head.next != null && head.val == data)
            {
                head = head.next;
                return head;
            }

            //Current is pointintg to head 
            ListNode current = head;
            //Prev is for pointing previous current node.
            ListNode prev = null; //Prev Currently pointing null

            while(current != null && current.next!= null)
            {   
                //Prev at current last node 
                prev = current;
                //Incrementing Current
                current = current.next;
                //If Node Value is matching Then..,
                if(current.val == data)
                {   
                    //Link Prev node to the address stored in current node
                    prev.next = current.next;
                    //Make current null , i.e Deleting current node
                    current = null;
                } 
            }
        return head;
    }
}
