class Solution {
    public int maxSubArray(int[] nums) {
       int sumMaxTillNow = nums[0], sumMaxCurrent = nums[0];
       for(int i=1; i< nums.length; i++){
           sumMaxCurrent = Math.max(sumMaxCurrent+nums[i], nums[i]);
           sumMaxTillNow = Math.max(sumMaxCurrent, sumMaxTillNow);
       }
        return sumMaxTillNow;
        
    }
}