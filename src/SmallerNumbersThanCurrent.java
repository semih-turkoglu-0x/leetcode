import java.util.Arrays;
import java.util.HashMap;

public class SmallerNumbersThanCurrent {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] ans = new int[nums.length];
		int cpt = 0;
		for(int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					cpt++;
				}
			}
			ans[i] = cpt;
			cpt = 0;
		}
		return ans;
	}
	public int[] smallerNumbersThanCurrentHash(int[] nums) {
		int[] ans = new int[nums.length];
		int[] sorted = nums.clone();
		Arrays.sort(sorted);
		HashMap<Integer, Integer> m = new HashMap<>();
		for(int i = 0; i < sorted.length; i++) {
			m.putIfAbsent(sorted[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			ans[i] = m.get(nums[i]);
		}
		return ans;
	}
}
