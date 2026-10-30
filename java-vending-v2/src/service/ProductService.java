package service;

import java.util.Scanner;

import repository.VendingRepository;
import vo.Product;

public class ProductService {

    Scanner sc;

    public ProductService(Scanner sc) {
        this.sc = sc;
    }

    // 동전 투입
    public void insertCoin() {

        System.out.println("돈을 넣어주세요");
        System.out.println("1: 5,000원, 2: 1,000원, 3: 500원, 4:100원");

        int coin = sc.nextInt();

        int money = 0;

        switch (coin) {

            case 1:
                money = 5000;
                break;

            case 2:
                money = 1000;
                break;

            case 3:
                money = 500;
                break;

            case 4:
                money = 100;
                break;

            default:
                System.out.println("잘못된 동전 선택입니다.");
                return;
        }

        VendingRepository.balance += money;

        System.out.println("투입금액 : " + String.format("%,d", money) + "원");
        System.out.println("사용 가능 금액 : " + VendingRepository.balance);
    }

    // 잔돈 반환
    public void returnChange() {

        int money = VendingRepository.balance;

        System.out.println(money + "원 반환 완료");

        VendingRepository.balance = 0;

        System.out.println("사용 가능 금액 : 0원");
    }

    // 메뉴 선택 및 구매
    public void selectProduct() {

        if (!hasProduct()) {
            System.out.println("현재 자판기에 상품이 없습니다.");
            return;
        }

        printAll();

        System.out.println("원하는 제품명을 입력하세요");
        String name = sc.next();

        int index = findProduct(name);

        if (index == -1) {
            System.out.println("없는 제품입니다.");
            return;
        }

        Product product = VendingRepository.products[index];

        // 재고 확인
        if (product.getStock() <= 0) {
            System.out.println("재고가 부족합니다.");
            return;
        }

        // 잔액 확인
        if (VendingRepository.balance < product.getPrice()) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        // 구매 처리
        VendingRepository.balance -= product.getPrice();

        product.setStock(product.getStock() - 1);

        System.out.println(
                product.getName() + "출력 완료, 남은 돈 : "
                        + VendingRepository.balance
                        + " , 재고 : " + product.getStock()
        );
    }

    // 전체 메뉴 보기
    public void printAll() {

        if (!hasProduct()) {
            System.out.println("현재 자판기에 상품이 없습니다.");
            return;
        }

        System.out.println("============ 메뉴 ============");

        for (int i = 0; i < VendingRepository.products.length; i++) {

            if (VendingRepository.products[i] != null) {
                System.out.println(VendingRepository.products[i]);
            }
        }

        System.out.println("===========================");
    }

    // 상품 존재 여부 확인
    public boolean hasProduct() {

        for (int i = 0; i < VendingRepository.products.length; i++) {

            if (VendingRepository.products[i] != null) {
                return true;
            }
        }

        return false;
    }

    // 상품 이름으로 검색
    public int findProduct(String name) {

        for (int i = 0; i < VendingRepository.products.length; i++) {

            if (VendingRepository.products[i] != null &&
                    VendingRepository.products[i].getName().equals(name)) {

                return i;
            }
        }

        return -1;
    }
}