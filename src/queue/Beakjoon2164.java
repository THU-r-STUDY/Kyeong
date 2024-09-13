package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Beakjoon2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        Queue<Integer> q = new LinkedList<>();

        // 순서대로 들어있는 큐 생성
        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }

        while(q.size()!=1){
            q.poll(); //제일 위의 카드 버리고
            q.offer(q.poll()); //그 다움 제일 위의 카드 제일 아래의 카드 밑으로 옮기기
        }
        System.out.println(q.poll());
    }
}

