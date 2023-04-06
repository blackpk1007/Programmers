class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        answer = new int[emergency.length];
        
        for(int i=0; i<emergency.length; i++){
            int num = 1;
            for(int j=0; j<emergency.length; j++){
                if(emergency[i] < emergency[j]){
                    num ++;
                }
            }
            answer[i] = num;
        }
        return answer;
    }
}