package math;

/*
 *   문제 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 *   입력 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
 *         다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 *   출력 : 주어진 수들 중 소수의 개수를 출력한다.
 *   예제 :
 *   입력
 *   4
 *   1 3 5 7
 *   출력
 *   3
 */

import java.util.Scanner;

public class baekjoon1978 {
    public static boolean getPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int prime = 0;

        for (int i = 0; i < N; i++) {
            if (getPrime(sc.nextInt())) prime++;
        }

        System.out.println(prime);
    }
}
