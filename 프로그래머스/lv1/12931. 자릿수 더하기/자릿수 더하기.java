import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = n+"";
        char c[] = new char[10];
        
        for(int i=0; i<s.length(); i++){
            c[i] = s.charAt(i);
            answer += (int)c[i]-48;
            System.out.print(answer);
        }
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
    
        return answer;
    }
}