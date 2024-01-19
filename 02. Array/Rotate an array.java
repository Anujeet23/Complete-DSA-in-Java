class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        //K rotaions
        while(k>0)
        {
            for(int i=n-2; i>=0; i--)
            {
                int temp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = temp; 
            }
            k--; 
        }
    }
}
