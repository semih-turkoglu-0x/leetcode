import java.util.ArrayDeque;
import java.util.Deque;

public class FinalPricesMonotonicStack {
	public int[] finalPrices(int[] prices) {
		int[] ans = prices.clone();
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < prices.length; i++) {
			while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
				int idx = stack.pop();
				ans[idx] = prices[idx] - prices[i];
			}
			stack.push(i);
		}
		return ans;
	}
}
