package greedy;

import java.util.Scanner;

public class Beakjoon2720 {
    public static void main(String[] args) {
        //첫째 줄 입력 - 테스트 케이스 개수 T
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        //배열 생성
        int[] cases = new int[T];

        //배열 안에 각 케이스 저장
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            cases[i] = N;
        }

        //동전의 종류를 배열로 정의
        int[] coins = {25,10,5,1};

        //거스름돈 (<=500) 계산
        for(int i=0; i<T; i++){
            int amount = cases[i];
            int quo=1, rem=0;
            for(int j=0; j<coins.length; j++) {
                quo = amount / coins[j];
                rem = amount % coins[j];
                if (j!= coins.length-1) {
                    System.out.print(quo + " ");
                }
                else{
                    System.out.print(quo);
                }
                amount = rem;
            }
            System.out.println();
        }

    }
}
