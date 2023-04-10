class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String temp = x+"";
        int sum = 0;
        for(int i=0; i<temp.length(); i++) {
			sum += temp.charAt(i)-48;
			
		}
		if(x % sum == 0) {
			answer = true;
		}else {
			answer = false;
		}
        return answer;
    }
}