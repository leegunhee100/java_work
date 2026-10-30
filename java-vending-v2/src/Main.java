import java.util.Scanner;

import service.ProductService;
import service.AdminService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductService productService = new ProductService(sc);
        AdminService adminService = new AdminService(sc, productService);

        while (true) {

            System.out.println("1. 동전 투입 2. 잔돈 반환 3. 메뉴 선택 4. 관리자 메뉴 5. 종료=>");

            int menu = sc.nextInt();

            switch (menu) {

                case 1:
                    productService.insertCoin();
                    break;

                case 2:
                    productService.returnChange();
                    break;

                case 3:
                    productService.selectProduct();
                    break;

                case 4:

                    // 관리자 메뉴
                    while (true) {

                        System.out.println("1.메뉴 등록 2.메뉴 삭제 3.메뉴 수정 4. 재고 등록 5. 전체목록보기 6. 이전=>");

                        int adminMenu = sc.nextInt();

                        switch (adminMenu) {

                            case 1:
                                adminService.addProduct();
                                break;

                            case 2:
                                adminService.deleteProduct();
                                break;

                            case 3:
                                adminService.updateProduct();
                                break;

                            case 4:
                                adminService.addStock();
                                break;

                            case 5:
                                productService.printAll();
                                break;

                            case 6:
                                break;

                            default:
                                System.out.println("잘못된 메뉴입니다.");
                                break;
                        }

                        if (adminMenu == 6) {
                            break;
                        }
                    }

                    break;

                case 5:
                    System.out.println("자판기를 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 메뉴입니다.");
                    break;
            }
        }
    }
}