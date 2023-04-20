import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        int[] temp = arr.clone();
        
        if(arr.length <= 1) {
            answer = new int[1];
			answer[0] = -1;
		}else {
			Arrays.sort(temp);
			int min = temp[0];
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != min) {
					list.add(arr[i]);
				}
			}
			answer = list.stream().mapToInt(i -> i).toArray();
		}
        return answer;
    }
}