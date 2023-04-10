import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
		Arrays.sort(arr);
        
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
        
		if(list.size()<1) {
			answer = new int[1];
			answer[0] = -1;
		}else {
            answer = new int[list.size()];
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
        return answer;
    }
}