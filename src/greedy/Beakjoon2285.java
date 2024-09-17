package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2285 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //첫째 줄 : 마을의 수 N
        int N = Integer.parseInt(bf.readLine());

        //배열 생성
        int[][] town = new int[N+1][2];

        //이후 N개의 줄 : 마을의 번호, 해당 마을의 거주민 수
        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int index = Integer.parseInt(st.nextToken());
            town[i][0] = index;
            int people = Integer.parseInt(st.nextToken());
            town[i][1] = people;
        }

        //각 케이스마다 거리를 저장할 배열 생성
        int[] distance = new int[N+1];

        //각 케이스마다 거리의 합 계산
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++) {
                if (town[j][0] < i) {
                    distance[i] += (town[j][1] * (i-town[j][0]));
                }
                else if(town[j][0]>i){
                    distance[i] += (town[j][1] * (town[j][0]-i));
                }
                else continue;
            }

        }

        //최소값에 해당하는 인덱스 출력
        int min = distance[1];
        int result=1;
        for(int i = 1; i <= N; i++){
           if(distance[i] < min){
               result = i;
           }
       }

        //결과
        System.out.println(result);

    }
}
