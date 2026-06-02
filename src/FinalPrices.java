public class FinalPrices {
	public int[] finalPrices(int[] prices) {
		int size = prices.length;
		int[] ans = new int[size];
		for (int i = 0; i < prices.length; i ++) {
			ans[i] = prices[i];
			for (int j = i+1; j < prices.length; j++) {
				if (prices[j] <= prices[i]) {
					ans[i] = prices[i] - prices[j];
					break;
				}
			}
		}
		return ans;
	}
}
