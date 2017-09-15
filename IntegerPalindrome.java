class Solution {
    public boolean isPalindrome(int x) {
        int i=0;
        String temp = Integer.toString(x);
        int len = temp.length();
        if(len == 1)
        {
            return true;
        }
        char a[] = temp.toCharArray();
        HashMap<Integer, Integer> map = new HashMap();
        while(i<=len/2){
            map.put(i, (int)a[i]); 
            if(map.containsKey(a[len-(i+1)])){
                if(i >= len/2) {
                   return true;
                }
                else{i++;}  
             }
            else
               break;
        }
        return false;
    }
}