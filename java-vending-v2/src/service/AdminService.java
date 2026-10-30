package service;

import java.util.Scanner;

import repository.VendingRepository;
import vo.Product;

public class AdminService {

    Scanner sc;
    ProductService productService;

    public AdminService(Scanner sc, ProductService productService) {
        this.sc = sc;
        this.productService = productService;
    }

    // 메뉴 등록
    public void addProduct() {

        int emptyIndex = -1;

        // 빈칸 찾기
        for (int i = 0; i < VendingRepository.products.length; i++) {

            if (VendingRepository.products[i] == null) {
                emptyIndex = i;
                break;
            }
        }

        // 최대 3개 제한
        if (emptyIndex == -1) {
            System.out.println("더 이상 등록할 수 없습니다. (최대 3개)");
            return;
        }

        System.out.println("자판기 메뉴 등록");

        System.out.println("제품 이름을 입력하세요");
        String name = sc.next();

        // 중복 검사
        if (productService.findProduct(name) != -1) {
            System.out.println("이미 등록된 제품입니다.");
            return;
        }

        System.out.println("제품의 가격?(숫자만 입력)");
        int price = sc.nextInt();

        if (price <= 0) {
            System.out.println("가격은 0보다 커야 합니다.");
            return;
        }

        System.out.println("재고 등록(채울 개수)");
        int stock = sc.nextInt();

        if (stock < 0) {
            System.out.println("재고는 0 이상이어야 합니다.");
            return;
        }

        VendingRepository.products[emptyIndex] =
                new Product(name, price, stock);
    }

    // 메뉴 삭제
    public void deleteProduct() {

        if (!productService.hasProduct()) {
            System.out.println("등록된 메뉴가 없습니다.");
            return;
        }

        productService.printAll();

        System.out.println("삭제할 제품명 입력 :");
        String name = sc.next();

        int index = productService.findProduct(name);

        if (index == -1) {
            System.out.println("없는 제품입니다.");
            return;
        }

        VendingRepository.products[index] = null;

        System.out.println("삭제 완료");
    }

    // 메뉴 수정
    public void updateProduct() {

        if (!productService.hasProduct()) {
            System.out.println("등록된 메뉴가 없습니다.");
            return;
        }

        productService.printAll();

        System.out.println("수정 할 제품명 입력");
        String name = sc.next();

        int index = productService.findProduct(name);

        if (index == -1) {
            System.out.println("없는 제품입니다.");
            return;
        }

        System.out.println("(수정) 메뉴 이름?");
        String newName = sc.next();

        // 중복 검사
        for (int i = 0; i < VendingRepository.products.length; i++) {

            if (i != index &&
                    VendingRepository.products[i] != null &&
                    VendingRepository.products[i].getName().equals(newName)) {

                System.out.println("이미 등록된 제품입니다.");
                return;
            }
        }

        System.out.println("(수정) 메뉴 가격 ?(숫자만 입력)");
        int newPrice = sc.nextInt();

        if (newPrice <= 0) {
            System.out.println("가격은 0보다 커야 합니다.");
            return;
        }

        System.out.println("(수정) 재고 수량?(숫자만 입력)");
        int newStock = sc.nextInt();

        if (newStock < 0) {
            System.out.println("재고는 0 이상이어야 합니다.");
            return;
        }

        Product product = VendingRepository.products[index];

        // 기존 상품 정보 덮어쓰기
        product.setName(newName);
        product.setPrice(newPrice);
        product.setStock(newStock);
    }

    // 재고 등록
    public void addStock() {

        if (!productService.hasProduct()) {
            System.out.println("등록된 메뉴가 없습니다.");
            return;
        }

        productService.printAll();

        System.out.println("재고를 수정 할 제품명 입력");
        String name = sc.next();

        int index = productService.findProduct(name);

        if (index == -1) {
            System.out.println("없는 제품입니다.");
            return;
        }

        System.out.println("(수정) 재고 수량?(숫자만 입력)");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("추가할 재고는 1개 이상이어야 합니다.");
            return;
        }

        Product product = VendingRepository.products[index];

        // 기존 재고에 추가
        product.setStock(product.getStock() + amount);
    }
}