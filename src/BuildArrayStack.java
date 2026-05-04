import java.util.ArrayList;
import java.util.List;

public class BuildArrayStack {
	public List<String> buildArray(int[] target, int n) {
		int tgtIdx = 0;
		List<String> l = new ArrayList<String>();
		for(int i = 1; i <= n ; i++) {
			if (tgtIdx == target.length) {
				break;
			}
			if (i == target[tgtIdx]) {
				l.add("Push");
				tgtIdx ++;
			} else {
				l.add("Push");
				l.add("Pop");
			}
		}
		return l;
	}
}
