package sorting;

import java.util.Arrays;

public class Programmers42746 {
    public String solution(int[] numbers){
        String answer = "";
        String[] arr = new String[numbers.length];

        //숫자를 문자열로 반환하여 배열에 저장
        for(int i=0; i<numbers.length; i++){
            arr[i] = Integer.toString(numbers[i]);
        }

        //문자열 내림차순 정렬
        //o1+o2가 o2+o1보다 큰 경우 음수 반환 -> 자리 변화x
        Arrays.sort(arr, (o1,o2)-> -(o1+o2).compareTo(o2+o1));

        //문자 붙이기
        for (String s : arr) {
            answer += s;
        }
        //배열 요소가 모두 0인 경우☆
        if(answer.charAt(0) == '0'){
            answer = "0";
        }

        return answer;
    }
}
