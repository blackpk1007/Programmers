class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        answer = new int[n/k];
        int count = 1;
        for(int i=0; i<answer.length; i++){
            answer[i] = k * count;
            count++;
        }
        return answer;
    }
}