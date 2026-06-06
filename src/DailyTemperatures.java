import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		int size = temperatures.length;
		int[] ans = new int[size];
		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < temperatures.length; i++) {
			while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
				int idx = stack.pop();
				ans[idx] = i - idx;
			}
			stack.push(i);
		}
		return ans;
	}
}
