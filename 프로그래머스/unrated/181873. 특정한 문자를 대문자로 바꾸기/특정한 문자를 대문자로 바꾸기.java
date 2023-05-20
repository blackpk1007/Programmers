class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
		sb.append(my_string);
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i) == alp.charAt(0)) {
				answer += String.valueOf(sb.charAt(i)).toUpperCase();
			}else {
				answer += sb.charAt(i);
			}
		}
        return answer;
    }
}