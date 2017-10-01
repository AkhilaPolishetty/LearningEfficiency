class RemovingElementFromJava {
    public int removeElement(int[] nums, int val) {
        
        int j =0;
        boolean FirstTime = true;
        if(nums.length == 0)
        {
            return 0;
        }
        for(int i =0; i<nums.length; i++)
        {
            if(nums[i] == val)
            {
                continue;
            }
            else
            {
                nums[j] = nums[i];
                j++;   
            }
            
        }
        return j;
    }
}