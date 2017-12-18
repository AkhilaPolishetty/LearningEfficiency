class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        char[] pattern_array = pattern.toCharArray();
        String[] split = str.split(" ");
        boolean result = true;
        if(pattern.length() != split.length) return false;
        for(int i =0; i< split.length; i++){
            char c = pattern_array[i];
            if(!map.containsKey(c)){
                if(!map.containsValue(split[i])) {
                    map.put(c, split[i]);
                }
                else{
                    result = false;
                    break;
                }
            }else{
                if(!map.get(c).equals(split[i]))  return false;
            }
        }
        return result;    
    }
}