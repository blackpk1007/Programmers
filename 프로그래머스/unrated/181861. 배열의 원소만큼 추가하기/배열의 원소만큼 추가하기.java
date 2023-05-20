import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
         for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i]; j++){
            	list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}