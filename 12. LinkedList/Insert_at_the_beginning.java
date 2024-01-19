class Solution {
    public ListNode insertAtTheBeginning(ListNode head, int data) {
        //If LL has 0 nodes , The one we will insert will be the first one.
        if(head == null)
        {  
            //Inserting data into head directly
            head = new ListNode(data);
            //Pointing Head to null as it's the only node in our LL
            head.next = null;
            return head; 
        }
        //If linked List has non-zero nodes 
        ListNode node = new ListNode(data);
        //As we are inserting at begining, 
        //Newly crearted node is pointing to head 
        node.next = head;
        //And New node is our head now !!
        head = node;

    return head;
    }
}
