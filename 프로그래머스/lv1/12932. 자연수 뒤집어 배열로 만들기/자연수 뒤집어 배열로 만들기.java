class Solution {
    public int[] solution(long n) {
        String str = n+"";
        int[] answer = new int[str.length()];
        int cnt = 0;
        
        for(int i=str.length()-1; i>=0; i--){
            
            answer[cnt] = str.charAt(i)-48;
            cnt ++;
        }
        
        return answer;
    }
}