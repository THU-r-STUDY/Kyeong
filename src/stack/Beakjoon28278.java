package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Beakjoon28278 {
    public static void main(String[] args) {

        //첫째 줄에 명령의 수 N이 주어진다.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //stack 구현
        Deque<Integer> stack = new ArrayDeque<Integer>();

        //둘째 줄부터 N개 줄에 명령이 하나씩 주어진다.
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            if(a == 1){
                int a1 = sc.nextInt();
                stack.push(a1);
            }
            if(a == 2){
                if(stack.isEmpty()){
                    System.out.println("-1");
                }
                else{
                    System.out.println(stack.pop());
                }
            }
            if(a == 3){
                System.out.println(stack.size());
            }
            if(a == 4){
                if(stack.isEmpty()){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            if(a == 5){
                if(!stack.isEmpty()){
                    System.out.println(stack.peek());
                }
                else{
                    System.out.println("-1");
                }
            }
        }
    }
}
