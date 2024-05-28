// Time Complexity: O(n)
// Space Complexity: O(n)

class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            } else if(maxProfit < price - minPrice){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}