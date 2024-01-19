class Solution {
    public ListNode findMiddleOfALinkedList(ListNode head) {
          //iF LL Dosen't exist, will middle be there ? 
            if(head == null)
            {
                    return head;
            }
           //If Length of LL is 1 then its middle
            if(head.next == null)
            {
                    return head;
            }
            
           /**Length OF LL Logic Start **/
           //Initializing length to zero
                int length = 0;
                ListNode len = head;

                while(len.next != null)
                {
                    length++;
                    len = len.next;
                }

            length  = length + 1;
            /**Length OF LL Logic End **/

            //Finding mid of LL
            int mid = 0;
            mid = length/2;
            ListNode current = head;
            
            //Traversing till mid of LL
            int i = 0;
            while(i<mid)
                {
                    current = current.next;
                    i++;
                }
        return current;
    }
}
