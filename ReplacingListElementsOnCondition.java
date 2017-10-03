class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> res = new ArrayList<String>();
        for(int i =1; i<= n; i++)
        {
            if(i%3 == 0 && i%5 ==0)
            {
                res.add("FizzBuzz");
            }
            else if(i%5 ==0)
            {
                res.add("Buzz");
            }
            else if(i%3 == 0)
            {
                res.add("Fizz");
            }
            else
            {
                String temp = Integer.toString(i);
                res.add(temp);
            }
        }
        return res;
        
    }
}