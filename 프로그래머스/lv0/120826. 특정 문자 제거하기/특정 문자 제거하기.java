import java.lang.StringBuffer;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        StringBuffer mysb = new StringBuffer(my_string);
        for(int i=my_string.length()-1; i>=0; i--){
            if(my_string.charAt(i) == letter.charAt(0)){
                mysb.deleteCharAt(i);
            }
        }
        answer = mysb.toString();
        return answer;
    }
}