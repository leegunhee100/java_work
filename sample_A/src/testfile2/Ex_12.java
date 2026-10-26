package testfile2;

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("금액을 입력하세요: ");
        int money = sc.nextInt();

        int count = money / 1000;
        money %= 1000;
        System.out.println("1000원 : " + count + "개");
        System.out.println("남은금액 : " + money + "원");

        count = money / 500;
        money %= 500;
        System.out.println("500원 : " + count + "개");
        System.out.println("남은금액 : " + money + "원");

        count = money / 100;
        money %= 100;
        System.out.println("100원 : " + count + "개");
        System.out.println("남은금액 : " + money + "원");

        count = money / 10;
        money %= 10;
        System.out.println("10원 : " + count + "개");
        System.out.println("남은금액 : " + money + "원");

        sc.close();
    }
}
