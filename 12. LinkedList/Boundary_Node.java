class Solution {
    public String isBoundaryNode(ListNode head, ListNode node) {
        //Checking if both are null means LL dosen't exist
        if(head == null || node == null)
        {
            return "none";
        }
        
        //If Head and Node are same then its First Node
        boolean first = (head == node);
        boolean last  = false;
        
        //If Node is not-null but the node is pointing to null
        //which means end of LL
        if(node != null && node.next == null)
        {
            last = true;
        }
        
        //There is only one node 
        if(first && last)
        {
            return "both";
        }
        else if(first)
        {
            return "first";
        }
        else if(last)
        {
            return "last";
        }
        return "none";
    }
}
