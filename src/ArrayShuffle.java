public class ArrayShuffle {
	public int[] shuffle(int[] nums, int n) {
		int[] ans = new int[2*n];
		int x, y;
		for(int i = 0; i < n; i++) {
			x = i;
			y = i + n;
			ans[2*i] = nums[x];
			ans[2*i+1] = nums[y];
		}
		return ans;
	}
}
