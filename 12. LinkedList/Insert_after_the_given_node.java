class Solution {
    public void insertAfterTheGivenNode(ListNode node, int data) {
        
        if(node == null)
        {
             //If Node is Empty Don't Do anything
        }
        else
        {     
            //If Node is non-empty then
           //Creating a new node and inserting data in it.
            ListNode newnode = new ListNode(data);
           //Now New node is pointing to the next node 
           //which was earlier pointed by node.
            newnode.next = node.next;
           //Connecting node and new-node
           //node was pointing to nothing so,
           //It should point to newly created node. 
            node.next = newnode; 
        }
    }
}
