class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=left; i<=right; i++){
              map.clear();
              map = Digits(i, map, i);
              if(map.containsKey(1) || map.isEmpty()){
                  continue;
              }else{
                  list.add(i);
              }
        }
        return list;
        
    }
    
    public HashMap<Integer, Integer> Digits(int num,  HashMap<Integer, Integer> map_num, int main_number){
        if(num/10.0 >0){
            int temp = num %10;
            if(temp != 0 && main_number % temp == 0){
              map_num.put(0, main_number);  
            } else{
                map_num.put(1, main_number); 
            }
            Digits(num/10, map_num, main_number);
        }
        return map_num;
    }
}