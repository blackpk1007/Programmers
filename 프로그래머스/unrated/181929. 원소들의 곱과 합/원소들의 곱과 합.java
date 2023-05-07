class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int temp = 1;
        for(int i=0; i<num_list.length; i++){
            sum += num_list[i];
            temp *= num_list[i];
        }
        
        if( (sum * sum) > temp){
            answer = 1;
        }else{
            answer = 0;
        }
            
        return answer;
    }
}