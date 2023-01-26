package math;

/*
 *   문제 : 피보나치 수열은 다음과 같이 그 전 두 항의 합으로 계산되는 수열이다. 첫 두 항은 1로 정의된다.
 *                  f(1) = 1, f(2) = 1, f(n > 2) = f(n − 1) + f(n − 2)
 *         정수를 입력받아, 그에 해당하는 피보나치 수를 출력하는 프로그램을 작성하여라.
 *   입력 : 정수
 *   출력 : 피보나치 수
 *   예제 :
 *   입력
 *   100
 *   출력
 *   354224848179261915075
 */

import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon4150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        BigInteger num1 = BigInteger.valueOf(1);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger fibonacci = BigInteger.valueOf(1);
        if (N == 1 || N == 2) {
            System.out.println(fibonacci);
            return;
        } else {
            for (int i = 2; i < N; i++) {
                fibonacci = num1.add(num2);
                num1 = num2;
                num2 = fibonacci;
            }
        }
        System.out.println(fibonacci);
    }
}
