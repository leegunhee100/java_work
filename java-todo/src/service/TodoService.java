package service;

import java.util.Scanner;

import vo.Todo;
import repository.TodoRepository;

public class TodoService {

    Scanner sc = new Scanner(System.in);

    // 할 일 등록
    public void addTodo() {

        System.out.println("할 일 등록");

        int emptyIndex = -1;

        // 빈칸 찾기
        for (int i = 0; i < TodoRepository.todos.length; i++) {
            if (TodoRepository.todos[i] == null) {
                emptyIndex = i;
                break;
            }
        }

        // 빈칸이 없는 경우
        if (emptyIndex == -1) {
            System.out.println("더 이상 등록할 수 없습니다. (최대 5개)");
            return;
        }

        System.out.println("할 일을 입력하세요");
        String name = sc.next();

        // 중복 검사
        for (int i = 0; i < TodoRepository.todos.length; i++) {
            if (TodoRepository.todos[i] != null &&
                    TodoRepository.todos[i].getName().equals(name)) {

                System.out.println("이미 등록된 할 일입니다.");
                return;
            }
        }

        System.out.println("중요도?(1~3 숫자만 입력)");
        int importance = sc.nextInt();

        // 중요도 검사
        if (importance < 1 || importance > 3) {
            System.out.println("중요도는 1~3만 입력할 수 있습니다.");
            return;
        }

        // 객체 생성 및 배열 저장
        TodoRepository.todos[emptyIndex] = new Todo(name, importance);

        System.out.println("등록 완료");
    }

    // 할 일 삭제
    public void deleteTodo() {

        if (!hasTodo()) {
            System.out.println("등록된 할 일이 없습니다.");
            return;
        }

        printAll();

        System.out.println("삭제할 할 일 입력");
        String name = sc.next();

        for (int i = 0; i < TodoRepository.todos.length; i++) {

            if (TodoRepository.todos[i] != null &&
                    TodoRepository.todos[i].getName().equals(name)) {

                TodoRepository.todos[i] = null;

                System.out.println("삭제 완료");
                return;
            }
        }

        System.out.println("없는 할 일입니다.");
    }

    // 할 일 수정
    public void updateTodo() {

        if (!hasTodo()) {
            System.out.println("등록된 할 일이 없습니다.");
            return;
        }

        printAll();

        System.out.println("수정 할 할 일 입력");
        String name = sc.next();

        int index = findTodo(name);

        if (index == -1) {
            System.out.println("없는 할 일입니다.");
            return;
        }

        System.out.println("(수정) 할 일 이름?");
        String newName = sc.next();

        // 수정할 이름 중복 검사
        for (int i = 0; i < TodoRepository.todos.length; i++) {

            if (i != index &&
                    TodoRepository.todos[i] != null &&
                    TodoRepository.todos[i].getName().equals(newName)) {

                System.out.println("이미 등록된 할 일입니다.");
                return;
            }
        }

        System.out.println("(수정) 중요도?(1~3 숫자만 입력)");
        int newImportance = sc.nextInt();

        if (newImportance < 1 || newImportance > 3) {
            System.out.println("중요도는 1~3만 입력할 수 있습니다.");
            return;
        }

        // 기존 객체의 이름과 중요도만 수정
        TodoRepository.todos[index].setName(newName);
        TodoRepository.todos[index].setImportance(newImportance);

        System.out.println("수정 완료");
    }

    // 완료 체크
    public void toggleDone() {

        if (!hasTodo()) {
            System.out.println("등록된 할 일이 없습니다.");
            return;
        }

        printAll();

        System.out.println("완료 체크할 할 일 입력");
        String name = sc.next();

        int index = findTodo(name);

        if (index == -1) {
            System.out.println("없는 할 일입니다.");
            return;
        }

        Todo todo = TodoRepository.todos[index];

        todo.toggleDone();

        if (todo.isDone()) {
            System.out.println(todo.getName() + " → 완료");
        } else {
            System.out.println(todo.getName() + " → 미완료");
        }
    }

    // 전체 목록
    public void printAll() {

        if (!hasTodo()) {
            System.out.println("등록된 할 일이 없습니다.");
            return;
        }

        System.out.println("============ 할 일 목록 ============");

        for (int i = 0; i < TodoRepository.todos.length; i++) {

            if (TodoRepository.todos[i] != null) {
                System.out.println(TodoRepository.todos[i]);
            }
        }

        System.out.println("===================================");
    }

    // 남은 할 일
    public void printRemain() {

        int count = 0;

        System.out.println("============ 남은 할 일 ============");

        for (int i = 0; i < TodoRepository.todos.length; i++) {

            if (TodoRepository.todos[i] != null &&
                    !TodoRepository.todos[i].isDone()) {

                System.out.println(TodoRepository.todos[i]);
                count++;
            }
        }

        System.out.println("===================================");
        System.out.println("남은 할 일 : " + count + "개");
    }

    // 할 일이 있는지 확인
    private boolean hasTodo() {

        for (int i = 0; i < TodoRepository.todos.length; i++) {

            if (TodoRepository.todos[i] != null) {
                return true;
            }
        }

        return false;
    }

    // 이름으로 할 일 찾기
    private int findTodo(String name) {

        for (int i = 0; i < TodoRepository.todos.length; i++) {

            if (TodoRepository.todos[i] != null &&
                    TodoRepository.todos[i].getName().equals(name)) {

                return i;
            }
        }

        return -1;
    }
}