import java.util.LinkedList;
import java.util.Queue;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
       	Queue<Character> queue = new LinkedList<Character>();
        // 문자열 시작이 ) 이면은 false
		if(s.charAt(0) == ')') {
			answer = false;
		}
		else {
            // 문자열을 하나씩 쪼개서 배열로만들기
			for(char c : s.toCharArray()) {
                // 
				if(c == '(') {
					queue.add(c);
				}else {
					if(!queue.isEmpty()) {
						queue.poll();
					}else {
						answer = false;
						break;
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