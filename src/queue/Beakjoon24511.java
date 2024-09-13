package queue;

import java.util.Scanner;

public class Beakjoon24511 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //첫째 줄 - 자료구조의 개수 N
        int N = sc.nextInt();
        sc.nextLine(); //개행 제거

        //행에는 순서를 나타내는 값을, 열에는 자료구조(스택, 큐)형태와 각 자료구조 안의 요소값을 넣을 배열 생성
        int[][] A = new int[N][N];


        //둘째 줄 - 자료구조 형태 입력
        for (int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt();
        }

        //셋째 줄 - 요소값 입력
        for (int i = 0; i < N; i++) {
            A[i][1] = sc.nextInt();
        }

        //넷째 줄 - 삽입할 수열의 길이 M
        int M = sc.nextInt();
        sc.nextLine();

        //다섯째 줄 - 삽입할 원소를 담고 있는 길이M의 수열 C
        int[] C = new int[M];
        for (int i = 0; i < M; i++) {
            C[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int result=C[i];
            for (int j = 0; j < N; j++) {
                //j번째 자료구조가 큐인 경우
                if(A[j][0]==0){
                    int temp = result;
                    result = A[j][1];
                    A[j][1]= temp;
                }
                //j번째 자료구조가 스택인 경우
                else if (A[j][0]==1) {
                    A[j][1]=result;
                }
            }
            System.out.print(result+" ");
        }

    }
}
