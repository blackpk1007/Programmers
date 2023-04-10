class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = num;
        boolean tf = true;
            
        while(tf){
            if(temp != 1){
                if(temp % 2 == 0){
                    temp = temp / 2;
                    answer ++;
                }else{
                    temp = temp * 3 + 1;
                    answer ++;
                }
            }else{
                break;
            }
            if(answer > 500){
                answer = -1;
                tf = false;
            }
        }
        
        return answer;
    }
}