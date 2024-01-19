class Solution {
    public ListNode findNodeWithGivenData(ListNode head, int data) {
        //Assigning head to current which is new node
        ListNode current = head;
    
        //Traversing whole LL until null is encountered
        while(current != null)
        {   
            //Checking if the current node has the data if yes then return node
            if(current.val == data)
            {
                return current;  
            }
            //Updating current pointers value to the next node
            current = current.next;
        }
        return null;   
    }
}
