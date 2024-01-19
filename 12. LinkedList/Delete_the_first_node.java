class Solution {
    public ListNode deleteTheFirstNode(ListNode head) {
        
        //If LL dosen't Exists We don't have to delete anything
        if(head == null) 
        {
            return head;
        }
            //Current is copy of head
            ListNode current = head;
            //Head is pointing to next node loosing access to 1st node
            //Which we want to delete
            head = head.next;
            //Current was pointing 1st node, making it null
            current = null;
            //Even if we don't make current null it dosent mattter
            // as we already lost track of it using head, so it will not get printed anyways. 
        
        return head;
    }
}
