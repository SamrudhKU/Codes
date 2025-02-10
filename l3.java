// This program is to find the profit in market, array contains the stock market prices.

public class l3 {
    public static void main(String args[]) {
        int prices[] = new int[]{8,1,5,8,6,4};
        // int prices[] = new int[]{8,7,5,4};
        // int prices[] = new int[] { 1, 2 };

        // int min = Integer.MAX_VALUE;
        int profit = 0;


        // for(int i=0; i<prices.length;i++){
        // if (prices[i] < min) {
        // min = prices[i];
        // int j = i;
        // while (j<=prices.length-1) {
        // if (profit<= prices[j] - min) {
        // profit = prices[j] - min;
        // }
        // j++;
        // }
        // }
        // }

        // Optimied solution
        // for (int i = 0; i < prices.length; i++) {
        //     if (prices[i] < min) {
        //         min = prices[i];
        //     }
        //     if (i < prices.length - 1) {
        //         if (profit < prices[i+1] - min) {
        //             profit = prices[i+1] - min;
        //         }
        //     }
        // }


        // More optimized solution
        int buy = prices[0];
        for(int i = 1; i<prices.length;i++){
            if (prices[i]<buy) {
                buy = prices[i];
            } else if(prices[i]-buy > profit){
                profit = prices[i]-buy;
            }
        }
        int p = profit > 0 ? profit : 0;
        System.out.println(p);
    }
}
