public class MergeString {
	public String mergeAlternately(String word1, String word2) {
		int length1 = word1.length();
		int length2 = word2.length();
		StringBuilder res = new StringBuilder();
		int counter = 0;
		while (counter <= length1 | counter <= length2) {
			if (counter < length1) {
				res.append(word1.charAt(counter));
			}
			if (counter < length2) {
				res.append(word2.charAt(counter));
			}
			counter ++;
		}
		return res.toString();
	}
}
