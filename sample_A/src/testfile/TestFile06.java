package testfile;

import java.util.Scanner;

public class TestFile06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //스캐너 생성
        System.out.println("주사위 1: ");     //첫번쨰 주사위 입력
        int a = sc.nextInt();
        System.out.println("주사위 2: ");     //두번쨰 주사위 입력
        int b = sc.nextInt();
        System.out.println("주사위 3: ");     //세번쨰 주사위 입력
        int c = sc.nextInt();
        int prize;                          // 출력될 금액

        if (a == b && b == c) {             // a, b, c가 모두 같을때 그리고(&&(and))
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) {      // a, b, c중 2개만 같을때 또한(||(or))
            prize = 1000 + a * 100;
        } else if (b == c) {                // a, b, c가 다 를때
            prize = 1000 + b * 100;
        } else {
            int max = Math.max(a, Math.max(b, c)); // 제일 큰값을 찾을때 Math.max는
                                                    // 2개의 값만 비교가 되기때문에 Math.max(a, Math.max(b, c)를
                                                    // 입력 해서 3개까지 가능하게끔 작성
            prize = max * 100;                      // 최대 값 * 100
        }

        System.out.println("상금: " + prize + "원");

        sc.close();

    }
}
