class Solution {
    public int solution(String my_string) {
        int answer = 0;

        StringBuffer sb = new StringBuffer(my_string);
        
        for(int i=0; i<sb.length(); i++){
            if(!('a' <= sb.charAt(i) && sb.charAt(i) <= 'z')){
                if(!('A' <= sb.charAt(i) && sb.charAt(i) <= 'Z')){
                    answer += (int)sb.charAt(i) - 48;
                     
                }
            }
        }
        return answer;
    }
}