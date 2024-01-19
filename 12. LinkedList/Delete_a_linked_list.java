class Solution {
    public ListNode deleteAList(ListNode head) {
        //If LL dosen't Exists We don't have to delete anything
        if(head == null)
        {
            return head;
        }
        
         //Traversing all nodes one by one
        while(head != null)
        {  
            //Storing next node'c location which is next to head in newly created next node
            ListNode next = head.next;
            //Deleting the head
            head = null;
            //Head is now pointing to next node.
            head = next;
        }
    return null;
    }
}
