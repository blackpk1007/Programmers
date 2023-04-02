class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] ch = new char[my_string.length()];
        
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<ch.length; i++){
            ch[i] = my_string.charAt(i);
        }
        
        for(int i=0; i<ch.length; i++){
            for(int j=0; j<n; j++){
                sb.append(ch[i]);
            }
        }
        answer = sb.toString();
        return answer;
    }
}