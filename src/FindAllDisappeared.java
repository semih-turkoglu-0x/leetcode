import java.util.ArrayList;
import java.util.List;

public class FindAllDisappeared {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		int n = nums.length;
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0) {
				nums[index] *= -1;
			}
		}
		for (int i = 0; i < n; i++) {
			if(nums[i] > 0) {
				l.add(i + 1);
			}
		}
		return l;
	}
}
