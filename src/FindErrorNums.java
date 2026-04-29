import java.util.HashSet;
import java.util.Set;

public class FindErrorNums {
	public int[] findErrorNums(int[] nums) {
		int ans[] = new int[2];
		int duplicate = 0;
		Set<Integer> s = new HashSet<>();
		for (int num : nums) {
			if (s.contains(num)) {
				duplicate = num;
			}
			s.add(num);
		}
		for (int i = 1; i <= nums.length; i++) {
			if (!s.contains(i)) {
				ans[0] = duplicate;
				ans[1] = i;
			}
		}
		return ans;
	}
}
