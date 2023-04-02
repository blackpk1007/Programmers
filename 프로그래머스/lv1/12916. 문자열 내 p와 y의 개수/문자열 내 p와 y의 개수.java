class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] ch = new char[s.length()];
        int cntp = 0, cnty = 0;
        for(int i=0; i<s.length(); i++){
            ch[i] = s.charAt(i);
            
            if(ch[i] == 'p' || ch[i] == 'P'){
                cntp ++;
            }
            if(ch[i] == 'y' || ch[i] == 'Y'){
                cnty ++;
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        if(cntp == cnty){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}