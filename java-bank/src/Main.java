
import bank.Bank;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== " + Bank.BANK_NAME + " =====");

        // 고객 정보
        int customerNo = 1;
        String name = "홍길동";
        int age = 25;
        String grade = "B";

        // 고객 두 명 등록
        Bank.guestCount++;
        Bank.guestCount++;

        System.out.println(
                "고객번호: " + customerNo
                        + " / 이름: " + name
                        + " / 나이: " + age
                        + " / 등급: " + grade
        );

        // 번호표 발급
        int myTicket = 100;
        int nextTicket = 101;

        System.out.println(
                "내 번호표: " + myTicket
                        + ", 다음 대기 번호: " + nextTicket
        );

        System.out.println("안내: 1번 창구로 오세요");

        // 계좌 및 입금
        int balance = 0;
        balance += 50000;
        Bank.workCount++;

        System.out.println("입금 후 잔액: " + balance);

        // 출금 및 수수료
        int withdrawal = 12500;
        balance -= withdrawal + Bank.FEE;
        Bank.workCount++;

        System.out.println("출금 수수료: " + Bank.FEE);
        System.out.println("출금 후 잔액: " + balance);

        // 이자 계산
        int interest = (int) (balance * Bank.BONUS_RATE);

        System.out.println("이자: " + interest);

        balance += interest;
        Bank.workCount++;

        System.out.println("이자 지급 후 잔액: " + balance);

        // 대출 가능 여부
        boolean loanAvailable = age >= 20 && balance >= 30000;
        System.out.println("대출 가능: " + loanAvailable);

        // 우대 대상 여부
        boolean preferred = grade.equals("A") || grade.equals("S");
        System.out.println("우대 대상: " + preferred);

        // 화폐 단위 분해
        int amount = 38110;

        int tenThousand = amount / 10000;
        amount %= 10000;

        int thousand = amount / 1000;
        amount %= 1000;

        int hundred = amount / 100;
        amount %= 100;

        System.out.println(
                "만원권 " + tenThousand + "장, "
                        + "천원권 " + thousand + "장, "
                        + "백원 " + hundred + "개, "
                        + "남은 금액 " + amount + "원"
        );

        // 은행 통계
        System.out.println(
                "오늘의 총 고객 수: " + Bank.guestCount
                        + "명, 거래 건수: " + Bank.workCount + "건"
        );
    }
}
