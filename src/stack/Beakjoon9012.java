package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Beakjoon9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < T; i++){
            String sentence = sc.nextLine();

            //stack 구현
            Deque<Character> stack = new ArrayDeque<Character>();

            for(int j = 0; j < sentence.length(); j++){
                //charAt(j) : 문자열에서 j번째 인덱스에 있는 문자를 반환하는 메서드
                if(sentence.charAt(j) == '('){
                    stack.push(sentence.charAt(j));
                }
                //else - 다음 문자가 닫힌 괄호일 경우
                else{
                    //스택이 비어있다면
                    if(stack.isEmpty()){
                        stack.push(sentence.charAt(j));
                        break;
                    }
                    //스택 안에 열린 괄호가 있다면
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
