class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        
        for(int i=sb.length()-1; i>=0; i--){
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || 
               sb.charAt(i) == 'i' || sb.charAt(i) == 'o' ||
               sb.charAt(i) == 'u'){
                sb.deleteCharAt(i);
            }
        }
        answer = sb.toString();
        
        return answer;
    }
}