class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        int num = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){ 
                num ++;
            }
        }
        answer = new int[num];
        
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){ 
                answer[count] = i;
                count ++;
            }
        }
        return answer;
    }
}