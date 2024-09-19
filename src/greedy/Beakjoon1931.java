package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Beakjoon1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //첫째 즐 : 회의의 수 N
        int N = sc.nextInt();
        sc.nextLine();

        //회의를 저장할 배열
        int[][] meetingTimes = new int[N][2];

        //둘째 줄 ~ N+1줄 : 각 회의의 정보 (2^31-1)
        for (int i = 0; i < N; i++) {
            meetingTimes[i][0] = sc.nextInt();
            meetingTimes[i][1] = sc.nextInt();
        }

        //종료 시간 빠른 기준으로 배정하는 알고리즘 사용

        //정렬 : 종료 시간 기준
        Arrays.sort(meetingTimes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                //첫 번째 종료시간이 더 큰 경우 양수 반환 -> 뒤로 보낸다
                //첫 번째 종료시간이 더 작은 경우 음수 반환 -> 그대로
                return o1[1] - o2[1];
            }
        });

        //배정
        int count = 1; //첫 번째 회의는 무조건 선택되기에 초깃값 1로 설정
        int end = meetingTimes[0][1];
        for(int i = 1; i<N; i++){
            //현재 배정된 회의들의 마지막 끝나는 시간보다 크거나 같은 경우
            if(end<=meetingTimes[i][0]){
                count++;
                end = meetingTimes[i][1];
            }
        }
        System.out.println(count);
    }
}
