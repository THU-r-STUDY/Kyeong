package sorting;

import java.util.Arrays;

class Programmers42747 {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++){
            //count : 기준으로 잡은 요소보다 큰 요소들의 개수
            int count = citations.length - i;
            //누적된 count값보다 큰 값을 찾은 경우
            if(citations[i] >=count){
                return count;
            }
        }
        return 0; //예외
    }
}
