package sorting;

import java.util.PriorityQueue;

public class Programmers42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        //우선순위 큐
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : scoville) {
            pq.add(i);
        }

        while(pq.peek()<K){
            if(pq.size()<2){
                return -1;
            }

            int first = pq.poll();
            int second = pq.poll();
            int newScoville = first + second*2;
            pq.add(newScoville);

            answer++;
        }
        return answer;
    }
}
