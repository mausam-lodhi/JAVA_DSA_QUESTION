public class pricesOfStocks {

    public static void priceOfArray(int prices[]) {
        int buyingPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyingPrice < prices[i]) {
                profit = prices[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else
                buyingPrice = prices[i];

        }
        System.out.print("The max profit is : " + maxProfit);
    }

    public static void main(String[] args) {
        int prices[] = { 1, 2, 3, 4, 5 };
        priceOfArray(prices);

    }
}