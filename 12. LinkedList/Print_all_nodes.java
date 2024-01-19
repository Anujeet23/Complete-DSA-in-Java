class Solution {
    public void printAllNodesFromTheStart(ListNode head) {
        //Assigning head to current which is new node
        ListNode current = head;
        
        //Traversing with the help of current through all
        //LL until null is encountered
        while(current != null)
        {
            System.out.print(current.val);
        //Using this for formating
        if(current.next != null)
        {
            System.out.print(", ");
        }
        //Updating current pointers value to the next node
            current = current.next;
        }
    }
}
