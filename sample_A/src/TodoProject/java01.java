package TodoProject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class java01 {

    static class Todo {
        String task;
        LocalTime time;
        boolean completed;

        Todo(String title, LocalTime time) {
            this.task = task;
            this.time = time;
            this.completed = false;
        }
    }

    static Scanner sc = new Scanner(System.in);

    static Map<LocalDate, List<Todo>> todoMap = new HashMap<>();

    static DateTimeFormatter timeFormatter =
            DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== 날짜별 Todo List =====");
            System.out.println("1. 할 일 추가");
            System.out.println("2. 할 일 수정");
            System.out.println("3. 할 일 삭제");
            System.out.println("4. 완료 체크");
            System.out.println("5. 일별 출력");
            System.out.println("6. 전체 출력");
            System.out.println("7. 종료");
            System.out.print("메뉴 선택: ");

            String menu = sc.nextLine();

            switch (menu) {
                case "1":
                    addTodo();
                    break;
                case "2":
                    updateTodo();
                    break;
                case "3":
                    deleteTodo();
                    break;
                case "4":
                    completeTodo();
                    break;
                case "5":
                    showDailyTodo();
                    break;
                case "6":
                    showAllTodo();
                    break;
                case "7":
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 메뉴입니다.");
            }
        }
    }

    // 날짜 입력
    static LocalDate inputDate() {
        System.out.print("날짜 입력 (yyyy-MM-dd): ");
        return LocalDate.parse(sc.nextLine());
    }

    // 시간 입력
    static LocalTime inputTime() {
        System.out.print("시간 입력 (HH:mm, 예: 14:30): ");
        return LocalTime.parse(sc.nextLine(), timeFormatter);
    }

    // 번호 입력
    static int inputNumber() {
        System.out.print("번호 선택: ");
        return Integer.parseInt(sc.nextLine());
    }

    // 날짜별 목록 출력
    static void printTodos(LocalDate date) {
        List<Todo> todos = todoMap.get(date);

        System.out.println("\n[" + date + "의 할 일]");

        if (todos == null || todos.isEmpty()) {
            System.out.println("할 일이 없습니다.");
            return;
        }

        for (int i = 0; i < todos.size(); i++) {
            Todo todo = todos.get(i);

            String status =
                    todo.completed ? "[완료]" : "[미완료]";

            System.out.println(
                    (i + 1) + ". "
                            + status + " "
                            + todo.time.format(timeFormatter)
                            + " - " + todo.task
            );
        }
    }

    // 번호로 Todo 선택
    static Todo selectTodo(LocalDate date) {
        List<Todo> todos = todoMap.get(date);

        if (todos == null || todos.isEmpty()) {
            System.out.println("선택할 할 일이 없습니다.");
            return null;
        }

        printTodos(date);

        try {
            int number = inputNumber();

            if (number < 1 || number > todos.size()) {
                System.out.println("잘못된 번호입니다.");
                return null;
            }

            return todos.get(number - 1);

        } catch (NumberFormatException e) {
            System.out.println("번호를 숫자로 입력해 주세요.");
            return null;
        }
    }

    // 1. 할 일 추가
    static void addTodo() {
        try {
            LocalDate date = inputDate();
            LocalTime time = inputTime();

            System.out.print("할 일 입력: ");
            String title = sc.nextLine();

            if (title.trim().isEmpty()) {
                System.out.println("할 일 내용을 입력해 주세요.");
                return;
            }

            Todo todo = new Todo(title, time);

            todoMap.computeIfAbsent(
                    date, key -> new ArrayList<>()
            ).add(todo);

            System.out.println("등록 완료!");

        } catch (DateTimeParseException e) {
            System.out.println("날짜 또는 시간 형식이 올바르지 않습니다.");
        }
    }

    // 2. 할 일 수정
    static void updateTodo() {
        try {
            LocalDate date = inputDate();

            Todo todo = selectTodo(date);

            if (todo == null) {
                return;
            }

            System.out.println("1. 시간 수정");
            System.out.println("2. 내용 수정");
            System.out.println("3. 시간과 내용 모두 수정");
            System.out.print("수정 항목 선택: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    todo.time = inputTime();
                    break;

                case "2":
                    System.out.print("새로운 할 일 입력: ");
                    String title = sc.nextLine();

                    if (title.trim().isEmpty()) {
                        System.out.println("내용을 입력해 주세요.");
                        return;
                    }

                    todo.task = title;
                    break;

                case "3":
                    LocalTime newTime = inputTime();

                    System.out.print("새로운 할 일 입력: ");
                    String newTitle = sc.nextLine();

                    if (newTitle.trim().isEmpty()) {
                        System.out.println("내용을 입력해 주세요.");
                        return;
                    }

                    todo.time = newTime;
                    todo.task = newTitle;
                    break;

                default:
                    System.out.println("잘못된 선택입니다.");
                    return;
            }

            System.out.println("수정 완료!");

        } catch (DateTimeParseException e) {
            System.out.println("날짜 또는 시간 형식이 올바르지 않습니다.");
        }
    }

    // 3. 할 일 삭제
    static void deleteTodo() {
        try {
            LocalDate date = inputDate();

            List<Todo> todos = todoMap.get(date);

            if (todos == null || todos.isEmpty()) {
                System.out.println("삭제할 할 일이 없습니다.");
                return;
            }

            printTodos(date);

            int number = inputNumber();

            if (number < 1 || number > todos.size()) {
                System.out.println("잘못된 번호입니다.");
                return;
            }

            Todo removed = todos.remove(number - 1);

            if (todos.isEmpty()) {
                todoMap.remove(date);
            }

            System.out.println(
                    "'" + removed.task + "' 삭제 완료!"
            );

        } catch (NumberFormatException e) {
            System.out.println("번호를 숫자로 입력해 주세요.");
        } catch (DateTimeParseException e) {
            System.out.println("날짜 형식이 올바르지 않습니다.");
        }
    }

    // 4. 완료 체크
    static void completeTodo() {
        try {
            LocalDate date = inputDate();

            Todo todo = selectTodo(date);

            if (todo == null) {
                return;
            }

            todo.completed = true;

            System.out.println("완료 처리되었습니다!");

        } catch (DateTimeParseException e) {
            System.out.println("날짜 형식이 올바르지 않습니다.");
        }
    }

    // 5. 일별 출력
    static void showDailyTodo() {
        try {
            LocalDate date = inputDate();
            printTodos(date);

        } catch (DateTimeParseException e) {
            System.out.println("날짜 형식이 올바르지 않습니다.");
        }
    }

    // 6. 전체 출력
    static void showAllTodo() {
        if (todoMap.isEmpty()) {
            System.out.println("등록된 할 일이 없습니다.");
            return;
        }

        List<LocalDate> dates =
                new ArrayList<>(todoMap.keySet());

        dates.sort(LocalDate::compareTo);

        System.out.println("\n===== 전체 Todo List =====");

        for (LocalDate date : dates) {
            printTodos(date);
        }
    }
}