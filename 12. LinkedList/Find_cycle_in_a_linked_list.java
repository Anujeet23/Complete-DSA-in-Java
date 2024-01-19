class Solution {
    public boolean findCycleInALinkedList(ListNode head) {
         /**Floyd’s Cycle-Finding Algorithm **/
            //Intailizing both pointers to head 
                ListNode slow = head;
                ListNode fast = head;

                while(fast != null && fast.next != null)
                {      
                        //Incrementing slow by one node 
                        slow = slow.next;
                        //Incrementing fast by two node
                        fast = fast.next.next;
                        //If these pointers ever meet, it means there exits a cycle
                        if(slow == fast)
                        {
                            return true;
                        }
                }   
        return false;
    }
}
