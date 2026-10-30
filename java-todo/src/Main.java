import java.util.Scanner;

import service.TodoService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TodoService service = new TodoService();

        while (true) {

            System.out.println("1.할 일 등록 2.할 일 삭제 3.할 일 수정 4.완료 체크 5.전체 목록 6.남은 할 일 7.종료=>");

            int menu = sc.nextInt();

            switch (menu) {

                case 1:
                    service.addTodo();
                    break;

                case 2:
                    service.deleteTodo();
                    break;

                case 3:
                    service.updateTodo();
                    break;

                case 4:
                    service.toggleDone();
                    break;

                case 5:
                    service.printAll();
                    break;

                case 6:
                    service.printRemain();
                    break;

                case 7:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 메뉴입니다.");
                    break;
            }
        }
    }
}