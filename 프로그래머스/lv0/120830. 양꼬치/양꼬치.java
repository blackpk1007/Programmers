class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int s = n / 10;
        if(9 < n){
            answer = (n*12000) + (k*2000) - (s*2000);   
        }else{
            answer = (n*12000) + (k*2000);       
        }
        
        
        return answer;
    }
}