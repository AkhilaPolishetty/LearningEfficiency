class Solution {
    public int singleNumber(int[] nums) {
        int xor =0, xor2=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]>0){
                xor = xor ^ nums[i];
            }else{
               xor2 = xor2 ^ (nums[i]); 
            }
             
        }
        if(xor !=0 && xor2 ==0){
             return xor;
        }else{
             return xor2;
        }
        
    }
}