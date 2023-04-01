class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        for(int i=0; i<=100; i++){
            if(i*slice < n && n <= (i+1)*slice){
                answer = i+1;
            }
        }
        return answer;
    }
}