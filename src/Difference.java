public class Difference {
	public char findTheDifference(String s, String t) {
		int counter = 0;
		char s1 = 'k';
		char t1;
		while (counter <= t.length()) {
			if (counter < s.length()) s1 = s.charAt(counter);
			t1 = t.charAt(counter);
			if (t1 != s1) return t1;
			counter ++;
		}
		return 'a';
	}
}
