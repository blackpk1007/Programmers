class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        answer = new int[2];
        for(int i=0; i<keyinput.length; i++){
            if( (board[0] / 2) * -1 < answer[0]){
                if(keyinput[i].equals("left")){
                    answer[0] --;
                }
            }
            if(answer[0] < (board[0] / 2)){
                if(keyinput[i].equals("right")){
                    answer[0] ++;
                }
            }
            if( (board[1] / 2) * -1 < answer[1]){
                if(keyinput[i].equals("down")){
                    answer[1] --;
                }
            }
            if(answer[1] < (board[1] / 2)){
                if(keyinput[i].equals("up")){
                    answer[1] ++;
                }
            }
        }

        return answer;
    }
}