class Solution {
    public int solution(int price) {
        int answer = 0;
        double b = 0;
        if(500000 <= price){
            b = 0.2;
        }else if(300000 <= price){
            b = 0.1;
        }else if(100000 <= price){
            b = 0.05;
        }else{
            b = 0;
        }

        answer = (int)(price * (1.00 - b));
        
        return answer;
    }
}