import java.util.Arrays;
import java.util.Collections;


class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp = n+"";
        String temp2 = "";
        Integer[] arr = new Integer[temp.length()];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)temp.charAt(i)-48;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++) {
        	temp2 += arr[i]+"";
        }
        answer = Long.parseLong(temp2);
        
        return answer;
    }
}