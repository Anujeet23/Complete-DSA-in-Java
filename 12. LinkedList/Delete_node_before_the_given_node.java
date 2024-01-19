class Solution {
    public ListNode deleteNodeBeforeTheGivenNode(ListNode head,ListNode node) {
            
              //LL has no nodes
                if(head == null)
                {
                    return null;
                }        
              //If LL has only one node then we cant delete previous node.
                if(head == node)
                {
                    return head;
                }
                
              //Pointing to head
                ListNode current = head;
                //Pointing to null
                ListNode prev = null;
                //Temp is pointing one next to current
                ListNode temp = current.next;
              //If 2nd node is the node  then,
              //De-link with 1st node & increment head
                if(temp == node)
                {
                    head = head.next;
                    return head;
                }
            
              //Let's say prev is 1st node, current is 2nd node and temp is 3rd node 
                while(current != null && current.next != null && temp.next != null)
                {     
                        //Prev at current last node  
                        prev = current;
                        //Incrementing Current
                        current = current.next;
                        //Pointing one next to current,
                        //Updating temp
                        temp = current.next;
                        //If it's same as the node 
                        if(temp == node)
                        {   
                            //Connect 1st node and 3rd node as we will delete 2nd node 
                            prev.next = current.next;
                            //Deleting 2nd node, i.e one previous to node given.
                            current = null;
                        }
                }
        return head;
    }
}
