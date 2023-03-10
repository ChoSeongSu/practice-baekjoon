package math;

/*
 *   문제 : 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.
 *   입력 : 첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다.
 *         각 테스트 케이스는 한 줄로 이루어져 있다.
 *         각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고,
 *         다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1,000,000을 넘지 않는다.
 *   출력 : 각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.
 *   예제 :
 *   입력
 *   3
 *   4 10 20 30 40
 *   3 7 5 12
 *   3 125 15 25
 *   출력
 *   70
 *   3
 *   35
 */

import java.util.Scanner;

public class baekjoon9613 {
    public static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long sum = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum += getGCD(arr[j], arr[k]);
                }
            }
            System.out.println(sum);
        }
    }
}
