
package cafe;

public class Cafe {

    // 카페 공통 상수
    public static final String CAFE_NAME = "자바카페";
    public static final double DISCOUNT_RATE = 0.10;
    public static final int STAMP_LIMIT = 10;
    public static final int PAYMENT_AMOUNT = 20000;

    // 오늘의 통계
    public static int orderCount = 1;
    public static int salesCupCount = 0;

    // 다음 주문번호
    private static int nextOrderNumber = 200;

    // 주문번호 발급
    public static int getOrderNumber() {
        return nextOrderNumber++;
    }

    // 주문 및 판매 잔 수 집계
    public static void addOrder(int cups) {
        orderCount++;
        salesCupCount += cups;
    }

    // 할인 금액 계산
    public static int calculateDiscount(int price) {
        return (int) (price * DISCOUNT_RATE);
    }

    // 거스름돈 계산
    public static int calculateChange(int payment, int price) {
        return payment - price;
    }

    // 화폐 단위 분해
    public static void printMoney(int amount) {
        int thousand = amount / 1000;
        amount %= 1000;

        int fiveHundred = amount / 500;
        amount %= 500;

        int hundred = amount / 100;
        amount %= 100;

        int ten = amount / 10;
        amount %= 10;

        System.out.println(
                "천원권 " + thousand + "장, "
                        + "오백원 " + fiveHundred + "개, "
                        + "백원 " + hundred + "개, "
                        + "십원 " + ten + "개, "
                        + "남은 금액 " + amount + "원"
        );
    }
}
