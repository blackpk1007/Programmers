class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int temp = 0;
        answer = new int[num_list.length];
        
        for(int i=0; i<num_list.length/2; i++){
            temp = num_list[i];
            num_list[i] = num_list[num_list.length-i-1];
            num_list[num_list.length-i-1] = temp;
            System.out.println(num_list[num_list.length-i-1]);
            
        }
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}