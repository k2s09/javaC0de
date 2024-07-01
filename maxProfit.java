public class maxProfit {
    static int fn(int[] prices) {
        // No profit if one day
        if(prices.length == 1) return 0;
        // First we buy low
        int i, low = prices[0];
        for(i = 1; i < prices.length; i++) {
            if(prices[i] < low)
                low = prices[i]; // Swap with lowest
        }
        if (low == prices[prices.length-1])
            return 0;
        // Then we sell high
        int j, high = prices[i];
        for (j = i+1; j < prices.length; j++) {
            if(prices[j] > high)
                high = prices[i]; // Swap with highest
        }
        return high - low;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(fn(prices));
    }
}
