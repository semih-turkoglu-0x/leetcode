import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ExclusiveTime {
	public int[] exclusiveTime(int n, List<String> logs) {
		int[] ans = new int[n];
		Deque<Integer> stack = new ArrayDeque<>();
		int previous = 0;

		for (String log : logs) {
			String[] parts = log.split(":");
			int id = Integer.parseInt(parts[0]);
			String action = parts[1];
			int time = Integer.parseInt(parts[2]);

			if (action.equals("start")) {
				if (!stack.isEmpty()) {
					ans[stack.peek()] += time - previous;
				}
				stack.push(id);
				previous = time;
			} else {
				ans[stack.pop()] += time - previous + 1;
				previous = time + 1;
			}
		}
		return ans;
	}
}
