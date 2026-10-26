package testfile3;


import java.util.Random;
import java.util.Scanner;

public class EX_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            // 컴퓨터의 중복 없는 세 자리 숫자 생성
            int[] answer = new int[3];

            answer[0] = random.nextInt(9) + 1;

            do {
                answer[1] = random.nextInt(10);
            } while (answer[1] == answer[0]);

            do {
                answer[2] = random.nextInt(10);
            } while (answer[2] == answer[0]
                    || answer[2] == answer[1]);

            boolean correct = false;

            // 최대 10번 도전
            for (int turn = 1; turn <= 10; turn++) {
                System.out.print(turn
                        + "번째. 서로 다른 세 자리 정수를 입력해 주세요. > ");

                String input = sc.next();

                // 입력값 검사
                if (!input.matches("\\d{3}")
                        || input.charAt(0) == '0'
                        || input.charAt(0) == input.charAt(1)
                        || input.charAt(0) == input.charAt(2)
                        || input.charAt(1) == input.charAt(2)) {
                    System.out.println("서로 다른 세 자리 숫자를 입력하세요.");
                    turn--;
                    continue;
                }

                String[] str = input.split("");
                int[] guess = new int[3];

                for (int i = 0; i < 3; i++) {
                    guess[i] = Integer.parseInt(str[i]);
                }

                int strike = 0;
                int ball = 0;

                // 스트라이크와 볼 계산
                for (int i = 0; i < 3; i++) {
                    if (guess[i] == answer[i]) {
                        strike++;
                    } else {
                        for (int j = 0; j < 3; j++) {
                            if (guess[i] == answer[j]) {
                                ball++;
                                break;
                            }
                        }
                    }
                }

                System.out.println(strike + " strike, "
                        + ball + " ball");

                if (strike == 3) {
                    System.out.println("정답입니다!!!");
                    correct = true;
                    break;
                }
            }

            // 10회 안에 맞추지 못한 경우
            if (!correct) {
                System.out.println("실패했습니다!!! 정답은 "
                        + answer[0] + answer[1] + answer[2] + "입니다.");
            }

            // 재시작 여부 확인
            System.out.print("계속하시겠습니까(Y/N) > ");
            String restart = sc.next();

            if (!restart.equalsIgnoreCase("Y")) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }

        sc.close();
    }
}
