package switchCondition;

import java.util.Scanner;

public class VendingSwitch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("==================");
            System.out.println("메뉴번호를 선택하세요");
            System.out.println("1. 커피(1,500원)");
            System.out.println("2. 주스(1,000원)");
            System.out.println("3. 물(500원)");
            System.out.println("4. 종료");
            System.out.println("==================");
            System.out.println("번호 입력 : ");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("커피");
                    break;
                case 2:
                    System.out.println("주스");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                case 4:
                    System.out.println("종료");
                    return;
                default:
                    System.out.println("잘못선택했습니다.");
            }
        }
    }
}
