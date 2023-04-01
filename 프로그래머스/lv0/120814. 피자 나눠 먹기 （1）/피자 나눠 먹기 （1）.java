class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<=15; i++){
            if(i*7 < n && n <= (i+1)*7){
                answer = i+1;
            }   
        }
        return answer;
    }
}