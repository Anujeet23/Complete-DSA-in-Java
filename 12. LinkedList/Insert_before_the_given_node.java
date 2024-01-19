class Solution {
    public ListNode insertBeforeTheGivenNode(ListNode head, ListNode node,int data) 
    {   
        if(head == null)
        {
          //If Node is Empty Don't Do anything
        }
        else if(node == head)
        {   
            //For Inserting at the begining of LL
            ListNode newnode = new ListNode(data);
            newnode.next = head;
            head = newnode;
        }
        else
        { 
           //For Inseritng Anywhere in between
        ListNode current = head;
          //Traversing Current till the node before which we want to insert
        while(current.next != node)
        {
            current = current.next;
        }
         //Creating new node
            ListNode newnode = new ListNode(data);
         //Pointing newnode to the node
            newnode.next = current.next;
         //Linking Current and newnode
            current.next = newnode;
        }
    return head;
    }
}
