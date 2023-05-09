class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int asum = 0;
        int bsum = 0;
        
        asum = Integer.parseInt(a+""+b);
        bsum = Integer.parseInt(b+""+a);
        
        if(bsum < asum || asum == bsum){
            answer = asum;
        }else{
            answer = bsum;
        }
        
        return answer;
    }
}