public class Difference {
	public char findTheDifference(String s, String t) {
		char res = 0;
		for(char cs : s.toCharArray()) res ^= cs;
		for(char ct : t.toCharArray()) res ^= ct;
		return res;
	}
}
