class Solution {
    public int solution(int n) {
        int answer = 0;
        int j = n; 
        for(int i=1; i<=n; i++){
            if(i * (j / i) == n){
                answer ++;
            }
        }
        return answer;
    }
}