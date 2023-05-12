class Solution {
    public int[] solution(int start, int end) {
        int[] answer = {};
        answer = new int[start - end + 1];
        
        for(int i=0; start>=end; start--){
            
            answer[i] = start;
            i++;
        }
        return answer;
    }
}