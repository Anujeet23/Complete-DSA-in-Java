class Solution {
    public ListNode insertAtTheEnd(ListNode head, int data) {
           //If LL has 0 nodes , The one we will insert will be the first one.
        if(head == null)
        {  
            //Inserting data into head directly
            head = new ListNode(data);
            //Pointing Head to null as it's the only node in our LL
            head.next = null;
            return head; 
        }

            //Using Current for traversing through whole LL
            ListNode current = head;
            //Creating new node and assigning data to it.
            //Pointing it's next ot null
            ListNode node = new ListNode(data);
            node.next = null;
            
            //Traversing till last node of LL
            while(current.next != null)
            {
                current = current.next;
            }
            //Pointing from current node(Last node of LL) 
            //to the node that we wan't to insert at the end. 
            current.next = node;
        return head; 
    }
}
