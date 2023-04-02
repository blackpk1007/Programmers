class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        sb.reverse();
        answer = sb.toString();
        return answer;
    }
}