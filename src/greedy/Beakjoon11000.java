package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Beakjoon11000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //첫째 줄 : 수업의 개수 N
        int N = sc.nextInt();

        //수업 시간을 저장할 배열
        int[][] timesheet = new int[N][2];

        //이후 N개의 줄 : 시작 시간과 끝나는 시간
        for (int i = 0; i < N; i++) {
                timesheet[i][0] = sc.nextInt(); //시작 시간 저장
                timesheet[i][1] = sc.nextInt(); //끝나는 시간 저장
        }

        //정렬 - 시작 시간 기준
        Arrays.sort(timesheet, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        //우선순위 큐 이용 - 강의실 끝나는 시간 관리
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //첫 수업의 끝나는 시간 추가
        pq.add(timesheet[0][1]);

        //강의실 배정
        for (int i = 1; i < N; i++) {
            //강의실 재사용이 가능한 경우
            if(pq.peek() <= timesheet[i][0]) {
                pq.poll();
            }
            //추가 강의실이 필요한 경우
            pq.add(timesheet[i][1]);
        }

        //큐의 사이즈(강의실의 개수)출력
        System.out.println(pq.size());

    }
}
