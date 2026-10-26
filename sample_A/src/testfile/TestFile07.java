package testfile;
import java.util.Scanner;

//1. 스캐너 생성
//2. 초기 잔액 설정
//3. 실행하는 동안(while) 메뉴판 출력
//4. 매뉴 번호 입력
//5. 1번 입력시 금액 입력 및 저장
//6. 2번입력시 케이스 1~3 금액 설정
//7. if - else 변수 입력 기존 저장했던 금액 - 선택한 음료의 금액
//8. 3번 입력시 현재 잔액 출력
//9. 4번 입력시
//10. 4번 입력시 sc.close();로 스캐너가 닫히고 return; 으로 프로그램을 종료

public class TestFile07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //1. 스캐너 생성

        int balance = 0; // 2.초기 잔액

        while (true) {    //3. 실행하는 동안(while) 메뉴판 출력
            System.out.println("\n===== 음료 자판기 =====");
            System.out.println("1. 금액 투입");
            System.out.println("2. 음료 선택");
            System.out.println("3. 잔액 확인");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();       //4. 매뉴 번호 입력

            switch (menu) {
                case 1 -> {     //5. 1번 입력시
                    System.out.print("투입할 금액: ");
                    int money = sc.nextInt();

                    if (money > 0) {
                        balance += money;
                        System.out.println(money + "원이 투입되었습니다.");
                    } else {
                        System.out.println("올바른 금액을 입력하세요.");
                    }
                }

                case 2 -> {      //6. 2번입력시
                    System.out.println("===== 음료 선택 =====");
                    System.out.println("1. 커피 (1500원)");
                    System.out.println("2. 주스 (1000원)");
                    System.out.println("3. 물 (500원)");
                    System.out.print("음료 선택: ");

                    int drink = sc.nextInt();

                    int price = switch (drink) {
                        case 1 -> 1500;
                        case 2 -> 1000;
                        case 3 -> 500;
                        default -> 0;
                    };

                    if (price == 0) {   //7. if - else 변수 입력 기존 저장했던 금액 - 선택한 음료의 금액
                        System.out.println("잘못된 음료 선택입니다.");
                    } else if (balance >= price) {
                        balance -= price;

                        String name = switch (drink) {
                            case 1 -> "커피";
                            case 2 -> "주스";
                            case 3 -> "물";
                            default -> "";
                        };

                        System.out.println(name + "가 나왔습니다.");
                        System.out.println("남은 잔액: " + balance + "원");
                    } else {
                        System.out.println("잔액이 부족합니다.");
                        System.out.println("현재 잔액: " + balance + "원");
                    }
                }

                case 3 -> {      //8. 3번 입력시
                    System.out.println("현재 잔액: " + balance + "원");
                }

                case 4 -> {     //9. 4번 입력시
                    System.out.println("잔돈 " + balance + "원을 반환합니다.");
                    System.out.println("자판기를 종료합니다.");
                    sc.close();
                    return;    //10. 4번 입력시 sc.close();로 스캐너가 닫히고 return; 으로 프로그램을 종료
                }

                default -> {
                    System.out.println("잘못된 메뉴입니다. 다시 선택하세요.");
                }
            }
        }
    }
}
