class Solution {
    public ArrayList<ListNode> findNodeWithGivenDataII(ListNode head,int data) 
    {
        //Assigning head to current which is new node
        ListNode current = head;
        //Creating Arraylist to store matching nodes
        ArrayList<ListNode> ans = new ArrayList<>();
        //Traversing whole LL until null is encountered
        while(current != null)
        {   
        //Checking if the current node has the data if yes then return node
            if(current.val == data)
            {   
                //Add is used for inserting element into the Arraylist
                ans.add(current);
            }
            //Updating current pointers value to the next node
            current = current.next;
        }
        return ans;
    }
}