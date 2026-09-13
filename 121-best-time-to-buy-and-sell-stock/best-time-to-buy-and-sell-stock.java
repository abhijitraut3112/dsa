class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0]; //7/1 /5
        int bestProfit = 0;//6

        for(int i=0; i < prices.length ; i++){
            if(prices[i] < minPrice ){ //1<7
                minPrice =  prices[i]; //1 /5
            }
            else{
               bestProfit = Math.max(bestProfit ,   prices[i] - minPrice) ;
                //bestProfit = (0,5-7) //6
            }
        }
        return bestProfit;
        
    }
}