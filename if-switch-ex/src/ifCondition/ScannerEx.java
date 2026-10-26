package ifCondition;

import java.util.Scanner;

public class ScannerEx {
    static void main(String[] args) {
        // 스캐너를 구입
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        // m : method - 기능을 수핼, 함수(function)
        System.out.println("이름을 입력하시오");
        name = sc.next();
        System.out.println("입력한 이름은 : " + name);
        System.out.println("나이를 입력하시오");
        age = sc.nextInt();
        System.out.println("나이는 : " + age);
        //키를 입력받습니다. 단, 실수로
        System.out.println("키를 입력하시오");
        double key;
        key = sc.nextDouble();
        System.out.println("키는 : " + key);
    }
}
