package greedy;

import java.util.Scanner;

public class Beakjoon12904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //첫째 줄 - 문자열 S
        String S = sc.nextLine();

        //둘째 줄 - 문자열 T
        String T = sc.nextLine();

        //T→S
        while(T.length() > S.length()) {
            //T의 맨 마지막 문자가 A로 끝나면 A 제거
            if(T.charAt(T.length()-1)=='A'){
                //substring메서드 이용하여 특정 부분만 추출
                T = T.substring(0, T.length()-1);
            }
            //T의 맨 마지막 문자가 B로 끝날 경우
            else{
                //B제거
                T = T.substring(0, T.length()-1);
                //문자열 뒤집는 메서드 reverse를 가지고있는 클래스 StringBuilder 인스턴스 생성
                StringBuilder sb = new StringBuilder(T);
                T = sb.reverse().toString();
            }
        }

        //결과 비교
        if(S.equals(T)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }


    }
}
