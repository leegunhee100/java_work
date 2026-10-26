package testfile3;


import java.util.Scanner;

public class EX_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호를 입력하세요(- 없이): ");
        String jumin = sc.nextLine();

        int[] weights = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int sum = 0;

        // 입력값 길이 검사
        if (!jumin.matches("\\d{13}")) {
            System.out.println("잘못된 주민번호입니다.");
            return;
        }

        // 마지막 자리 전까지 가중치를 곱해 합산
        for (int i = 0; i < 12; i++) {
            sum += (jumin.charAt(i) - '0') * weights[i];
        }

        // 검증 숫자 계산
        int check = (11 - (sum % 11)) % 10;
        int last = jumin.charAt(12) - '0';

        // 결과 출력
        if (check == last) {
            System.out.println("올바른 주민번호입니다.");
        } else {
            System.out.println("잘못된 주민번호입니다.");
        }

        sc.close();
    }
}
