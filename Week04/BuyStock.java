package week04;


/**
 * 买卖股票的最佳时机 II
 */
public class BuyStock {

    public static void main(String[] args) {
        int res = maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(res);
    }

    private static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int tmp = prices[i] - prices[i - 1];
            if (tmp > 0) profit += tmp;
        }
        return profit;
    }


}
