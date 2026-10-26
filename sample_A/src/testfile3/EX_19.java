package testfile3;


import java.util.Scanner;

public class EX_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("카드번호 16자리를 입력하세요: ");
        String card = sc.nextLine();

        // 16자리 숫자인지 검사
        if (!card.matches("\\d{16}")) {
            System.out.println("유효하지 않은 카드번호입니다.");
            sc.close();
            return;
        }

        int sum = 0;

        // 오른쪽에서 왼쪽으로 검사
        for (int i = 15; i >= 0; i--) {
            int num = card.charAt(i) - '0';

            // 오른쪽 끝에서 짝수 번째 자리
            if ((15 - i) % 2 == 1) {
                num *= 2;

                if (num > 9) {
                    num -= 9;
                }
            }

            sum += num;
        }

        // 합계가 10의 배수인지 확인
        if (sum % 10 == 0) {
            System.out.println("유효한 카드번호입니다.");
        } else {
            System.out.println("유효하지 않은 카드번호입니다.");
        }

        sc.close();
    }
}
