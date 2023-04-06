class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        answer = new int[num];
        int firstnum = 0;
        int middlenum = total / num;
        
        if(num % 2 == 0){
            firstnum = middlenum - (num / 2 - 1) ;
        }else{
            firstnum = middlenum - num / 2;
        }
        
        System.out.println("firstnum : "+firstnum);
        System.out.println("middlenum : "+middlenum);
        
        for(int i=0; i<num; i++){
            answer[i] = firstnum;
            firstnum++;
        }

        
        return answer;
    }
}