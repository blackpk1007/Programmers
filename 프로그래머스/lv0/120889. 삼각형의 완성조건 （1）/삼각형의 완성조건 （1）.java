class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int num = 0;
        int sum = 0;
        
        for(int i=0; i<sides.length; i++){
            if(sides[i] > max){
                max = sides[i];
                num = i;
            }
        }
        for(int i=0; i<sides.length; i++){
            if(num != i){
                sum += sides[i];
            }
        }
        System.out.println("max : "+max+", sum : "+sum);
        if(sum > max){
            answer = 1;
        }else{
            answer = 2;
        }
        
        return answer;
    }
}