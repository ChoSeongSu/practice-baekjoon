package string;

/*
 *   문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *   입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *         각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
 *   출력 : 각 테스트 케이스마다 A+B를 출력한다.
 *   예제 :
 *   입력
 *   5
 *   1,1
 *   2,3
 *   3,4
 *   9,8
 *   5,2
 *   출력
 *   2
 *   5
 *   7
 *   17
 *   7
 */

import java.util.Scanner;

public class baekjoon10953 {
    public static int solution(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            System.out.println(solution(str.split(",")[0], str.split(",")[1]));
        }
    }
}
