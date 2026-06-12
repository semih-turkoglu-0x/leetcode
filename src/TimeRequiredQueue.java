import java.util.ArrayDeque;
import java.util.Deque;

public class TimeRequiredQueue {
	public int timeRequiredToBuy(int[] tickets, int k) {
		Deque<int[]> queue = new ArrayDeque<>();
		int timeCount = 0;
		for (int i = 0; i < tickets.length; i++) {
			queue.add(new int[]{i, tickets[i]});
		}

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int idx = current[0];
			int ticketsLeft = current[1];

			timeCount ++;
			ticketsLeft --;

			if (ticketsLeft == 0) {
				if (idx == k) return timeCount;
			} else {
				current[1] = ticketsLeft;
				queue.add(current);
			}
		}
		return timeCount;
	}
}
