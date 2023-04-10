class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int total = 45;
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
            
        }
        answer = total - sum;
        
        return answer;
    }
}