class Solution {
    public long solution(long n) {
        long answer = 0;
        double b = Math.sqrt(n);
        
        if(b % 1 == 0){
         answer += (b+1)*(b+1);
        }else{
            answer = -1;
        }
        
        
        
        return answer;
    }
}