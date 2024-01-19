class Solution {
    public ListNode insertAtADistanceXFromTheStart(ListNode head,int X, int data) 
    {
        if(head == null)
        {
            //If Node is Empty Don't Do anything
        }
        else
        {
            //If node is not empty
            ListNode current = head;
            int i = 0;
          //Traversing one less than a given distance
          //Making Sure that we are not exceddeing LL
          //So that current pointer is not null  
            while( i < X-1 && current.next != null)
                {  
                    //Incremententing current pointer
                    current = current.next;
                    //Also incremententing i
                    i++;
                }
         //Creating new node and inserting data.
            ListNode newnode = new ListNode(data);
         //Pointing newnode to the node 
         //which was previously being pointed by current 
            newnode.next = current.next;
         //Now current is creating link with newly created node
            current.next = newnode;
        }
    return head;
    }
}
