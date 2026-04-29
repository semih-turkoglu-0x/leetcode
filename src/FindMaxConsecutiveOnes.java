public class FindMaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int current = 0;
		int max = 0;
		for (int num : nums) {
			if (num == 1) {
				current++;
			} else {
				current = 0;
			}
			if (current > max) {
				max = current;
			}
		}
		return max;
	}
}
