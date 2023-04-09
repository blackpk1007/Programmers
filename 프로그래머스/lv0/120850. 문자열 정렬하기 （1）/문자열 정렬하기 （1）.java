import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
		List<Integer> temp = new ArrayList<Integer>();
		
		for(int i=0; i<my_string.length(); i++) {
			if('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9') {
				temp.add(Integer.parseInt(my_string.charAt(i)+""));
			}
		}
		Collections.sort(temp);
		
		answer = new int[temp.size()];
		for(int i=0; i<temp.size(); i++) {
			answer[i] = temp.get(i);
		}
        return answer;
    }
}