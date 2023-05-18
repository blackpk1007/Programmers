import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
       	Queue<Character> queue = new LinkedList<Character>();
		if(s.charAt(0) == ')') {
			answer = false;
		}
		else {
			for(char c : s.toCharArray()) {
				if(c == '(') {
					queue.add(c);
				}else {
					if(!queue.isEmpty()) {
						queue.poll();
					}
				}
			}
		}
		if(queue.size() > 0) {
			answer = false;
		}
        return answer;
    }
}