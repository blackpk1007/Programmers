class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=0; i<=n; i++){
            if(n % 2 == 0){
                if(i % 2 == 0){
                    answer += (i * i);
                }
            }else{
                if( !(i % 2 == 0) ){
                    answer += i;
                }
            }
        }
        return answer;
    }
}