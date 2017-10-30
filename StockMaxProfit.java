class Solution {
    public int maxProfit(int[] prices) {
        //This approach is taking more than O(n^2) so it's getting time limit exceeded exception
//         int sell =0, buy =0;
//         Set<Integer> set = new HashSet<Integer>();
//         if(prices.length == 0 || prices.length ==1)
//         {
//             return 0;   
//         }
//         for(int i = 1, j=0; i<prices.length; i++)
//         {
//             if(prices[i] > prices[j])
//                  set.add(prices[i] - prices[j]);
            
//             if(i == prices.length-1)
//             {
//                 j++;
//                 i = j;
//                 set.add(0);
//             }
//         }
//         if(Collections.max(set) != null)
//         {
//             return Collections.max(set);

//         }
//         else
//         {
//             return 0;             
//         }
//     }
        
        //In order to avoid the exception trying to find the max profit by looping only once
        //Here we are using the concept of current min as the loop runs the days increase so 
        // you have to compare only with the next day to sell the stock
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] <minPrice)
                minPrice = prices[i];
            else if(prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }
}