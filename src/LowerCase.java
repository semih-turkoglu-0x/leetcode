public class LowerCase {
	public String toLowerCase(String s) {
		StringBuilder res = new StringBuilder();
		for (char c : s.toCharArray()) {
			int verif = c;
			if (verif > 96 && verif < 123){
				res.append(c);
				continue;
			}
			if (verif > 64 && verif < 91){
				verif += 32;
				res.append((char)verif);
				continue;
			}
			res.append(c);
		}
		return res.toString();
	}
}
