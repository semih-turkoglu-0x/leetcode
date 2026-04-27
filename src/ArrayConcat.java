public class ArrayConcat {
	public int[] getConcatenation(int[] nums) {
		int n = nums.length;
		int size = n * 2;
		int[] ans = new int[size];
		for (int i = 0; i < size ; i++) {
			ans[i] = nums[i%n];
		}
		return ans;
	}
}
