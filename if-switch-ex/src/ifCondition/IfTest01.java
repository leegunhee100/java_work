package ifCondition;

import java.util.Scanner;

public class IfTest01 {
    //나이를 입력박아서 20세이상이면 성인
    //그렇지 않으면 미성년을 출력하도록....
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("나이를 입력하시오");
        age = sc.nextInt();
        System.out.println("나이는 : " + age);
        if (age>=20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년 입니다.");
        }
    }
}
