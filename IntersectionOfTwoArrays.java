class Solution {

    //Initial version O(n^2)
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len =0, l=0, r=0, m=0;
        //r = len1-1;
        HashSet<Integer> set = new HashSet<Integer>();
        while(l<len1){
            while(r<len2){
                if(nums1[l] == nums2[r]){
                    if(!set.contains(nums2[r]))
                        set.add(nums2[r]);
                  
                }
                r++; 
            }
            r =0;
            l++;
        }
        int[] ints = new int[set.size()];
        int index = 0;
        for(Integer i : set){
             ints[index++] = i;
            }
        return ints;
    }


    //Improved version O(nlogn)
     public int[] intersection2(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(Integer i : nums2){
            boolean res = binarySearch(nums1, i);
            if(res)
               set.add(i);
        }    
        int[] result = new int[set.size()];
        int index = 0;
        for(Integer i : set){
             result[index++] = i;
            }
        return result;
        }
    
    
    boolean binarySearch(int[] array, int target){
        int len = array.length, l=0, r=len-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(array[m] == target)
                return true;
            if(array[m] <target)
                l= m+1;
            else
                r = m-1;
        }
        return false;
    }
}