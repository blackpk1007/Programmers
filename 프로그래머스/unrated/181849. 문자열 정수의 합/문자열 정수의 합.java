class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        StringBuffer str1 = new StringBuffer();
		str1.append(num_str);
		for(int i=0; i<str1.length(); i++) {
			answer += str1.charAt(i) - 48;
		}
        return answer;
    }
}