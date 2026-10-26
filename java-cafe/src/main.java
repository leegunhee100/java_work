
import cafe.Cafe;

public class main {

    public static void main(String[] args) {

        System.out.println("===== " + Cafe.CAFE_NAME + " =====");

        // 고객 정보
        String name = "김자바";
        int age = 20;
        boolean member = true;
        String grade = "S";

        System.out.println(
                "고객: " + name
                        + " / 나이: " + age
                        + " / 회원: " + member
                        + " / 등급: " + grade
        );

        // 주문번호 발급
        int myOrder = Cafe.getOrderNumber();

        System.out.println(
                "내 주문번호: " + myOrder
                        + ", 다음 주문번호: " + (myOrder + 1)
        );

        // 픽업 안내
        System.out.println("안내: 픽업대 A에서 받아가세요");

        // 주문 및 할인
        int orderPrice = 15800;
        int discount = Cafe.calculateDiscount(orderPrice);
        int finalPrice = orderPrice - discount;

        System.out.println("주문 금액: " + orderPrice);
        System.out.println("할인 금액: " + discount);
        System.out.println("결제 금액: " + finalPrice);

        // 결제 및 거스름돈
        int change = Cafe.calculateChange(
                Cafe.PAYMENT_AMOUNT, finalPrice
        );

        System.out.println("거스름돈: " + change);

        // 거스름돈 화폐 단위 분해
        Cafe.printMoney(change);

        // 스탬프: 기존 7개 + 이번 주문 3잔
        int stampCount = 7;
        int drinkCount = 3;

        stampCount += drinkCount;

        System.out.println("스탬프: " + stampCount + "개");

        // 무료 음료 쿠폰
        boolean freeDrinkCoupon =
                stampCount >= Cafe.STAMP_LIMIT;

        System.out.println("무료 음료 쿠폰: " + freeDrinkCoupon);

        // 더치페이 대상: 비회원이면서 주문 금액이 2만원 이상
        boolean dutchPayTarget =
                !member && orderPrice >= 20000;

        System.out.println("더치페이 대상: " + dutchPayTarget);

        // 오늘의 주문 및 판매 잔 수
        Cafe.addOrder(drinkCount);

        System.out.println(
                "오늘의 주문: " + Cafe.orderCount
                        + "건, 판매 잔 수: " + Cafe.salesCupCount + "잔"
        );
    }
}