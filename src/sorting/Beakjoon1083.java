package sorting;

import java.util.*;

//사용한 알고리즘 - 사전순으로 가장 뒷서는 것을 출력하려면 맨 앞에서부터 비교하면서 정렬해야 함

public class Beakjoon1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //첫째줄 : 크기 N
        int N = sc.nextInt();

        //크기 N인 배열 생성
        int[] arr = new int[N];

        //배열 안에 원소 넣기
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        //마지막 줄 : 교환 횟수 S
        int S = sc.nextInt();

        //count : 교환 횟수, place : 현재 인덱스 위치
        int count=0, place = 0;

        //정렬
        while(count<S){
            if(arr[place]<arr[place+1]){
                change(arr, place, place+1);
                count++;
            }
            else{
                continue;
            }
            place++;
        }

        //결과 출력
        for(int i = 0; i < N; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //자리 바꿔주는 change 메서드 생성
    public static void change(int[] arr, int a, int y){
        int temp = arr[a];
        arr[a] = arr[y];
        arr[y] = temp;
    }
}
