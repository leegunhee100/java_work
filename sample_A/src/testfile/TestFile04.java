package testfile;

import java.util.Scanner;

public class TestFile04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 1. 스캐너 생성

        System.out.print("시간을 입력하세요: "); // 2. 시간 입력 정수 생성(H)
        int H = sc.nextInt();

        System.out.print("분을 입력하세요: ");// 3. 분 입력 정수 생성(M)
        int M = sc.nextInt();

        M = M - 45; // 4. -45분의 시간을 출력

        if (M < 0) {   // 5. if문으로 만약 분이 0보다 작을떄
            M = M + 60;  // 예) 02시 -16분 일때 -16+60 = M(44)
            H = H - 1;  // 그럼으로 시간이 깎이기 떄문에 2-1 = H(1) 출력
        }

        if (H < 0) { //만약 시간(H) 가 0보다 작을때는 23시로 넘어가야 하니
            H = 23; // H값을 23으로 설정
        }

        System.out.println(H + " " + M);  // 출력 ( H(시간) + "공백" + M(분)) 으로 출력

        sc.close(); // 스캐너가 꺼짐
    }
}