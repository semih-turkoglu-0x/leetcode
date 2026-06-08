import java.util.ArrayDeque;
import java.util.Deque;

public class LargestRectangle {
	public int largestRectangleArea(int[] heights) {
		int n = heights.length;
		int[] prevSmaller = new int[n];
		int[] nextSmaller = new int[n];
		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
				stack.pop();
			}
			prevSmaller[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(i);
		}
		stack.clear();

		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
				stack.pop();
			}
			nextSmaller[i] = stack.isEmpty() ? n : stack.peek();
			stack.push(i);
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			int width = nextSmaller[i] - prevSmaller[i] - 1;
			max = Math.max(max, width * heights[i]);
		}
		return max;
	}
}
