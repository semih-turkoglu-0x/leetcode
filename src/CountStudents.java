import java.util.ArrayDeque;
import java.util.Deque;

public class CountStudents {
	public int countStudents(int[] students, int[] sandwiches) {
		Deque<Integer> file = new ArrayDeque<>();
		for (int j : students) {
			file.add(j);
		}
		int cpt = 0;
		int noMatch = 0;
		while(!file.isEmpty() && cpt < sandwiches.length) {
			if (file.peek()==sandwiches[cpt]) {
				file.poll();
				cpt++;
				noMatch = 0;
			} else {
				int student = file.poll();
				file.addLast(student);
				noMatch++;
				if(noMatch == file.size()) break;
			}
		}
		return file.size();
	}
}
