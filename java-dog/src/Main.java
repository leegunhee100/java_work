
import java.util.Scanner;
import dog.DogService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        dog.DogService service = new DogService();

        while (true) {

            System.out.println("\n===== 강아지 관리 프로그램 =====");
            System.out.println("1. 강아지 등록");
            System.out.println("2. 강아지 목록");
            System.out.println("3. 강아지 삭제");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");

            int menu = sc.nextInt();

            if (menu == 1) {

                System.out.print("이름: ");
                String name = sc.next();

                System.out.print("나이: ");
                int age = sc.nextInt();

                System.out.print("견종: ");
                String breed = sc.next();

                service.insertDog(name, age, breed);

            } else if (menu == 2) {

                service.selectAll();

            } else if (menu == 3) {

                System.out.print("삭제할 강아지 이름: ");
                String name = sc.next();

                service.deleteDog(name);

            } else if (menu == 4) {

                System.out.println("프로그램을 종료합니다.");
                break;

            } else {

                System.out.println("잘못된 메뉴입니다.");
            }
        }
    }
}
