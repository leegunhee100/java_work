package testfile;

import java.util.Scanner;

public class TestFile05 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in); // 1. 스캐너 생성
        System.out.println("현재 시간(시)을 입력하세요: "); // 2. 시(H) 입력
        int H = sc.nextInt();
        System.out.println("현재 시간(분)을 입력하세요: "); // 3. 분(M) 입력
        int M = sc.nextInt();
        System.out.println("요리 시간(분)을 입력하세요: "); // 4. 요리 시간(분(C)) 입력
        int C = sc.nextInt();

        M = M + C;  // 현제 시간분 (M) + 요리 시간분 (C) = 경과 시간(M)

        H = H + M / 60;  // 만약 분이 60분을 넘어 가면 시간이 1 추가 되어야 함
                         // 예) H(4시) M(66) / 60) = (M)1 4+1 = H = 5
        M = M % 60;      // 예) 위에서 66분 %(나머지) 60 = 6이 남으니 M=06분

        H = H % 24;      // 24시가 넘으면 0시부터 시작이 되어야 함
                // 예)위에 5시이니 5%24는 성립이 안되기 때문에 그대로 5가 출력 만약 24%24가 되면 0시로 출력

        System.out.println(H + " " + M);

        sc.close();  // 스캐너가 꺼짐
    }
}
