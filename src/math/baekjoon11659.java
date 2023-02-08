package math;

/*
 *   문제 : 수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
 *   입력 : 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다.
 *         둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다.
 *         셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.
 *   출력 : 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
 *   예제 :
 *   입력
 *   5 3
 *   5 4 3 2 1
 *   1 3
 *   2 4
 *   5 5
 *   출력
 *   12
 *   9
 *   1
 */

import java.util.Scanner;

public class baekjoon11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long S[] = new long[N + 1];
        long sum[] = new long[N + 1];

        for (int i = 1; i <= N; i++) {
            S[i] = sc.nextInt();
        }
        sum[0] = S[0];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + S[i];
        }

        for (int i = 0; i < M; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(sum[end] - sum[start - 1]);
        }
    }
}
