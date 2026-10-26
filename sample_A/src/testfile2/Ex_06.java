package testfile2;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        while (true) {
            System.out.print("A 입력: ");
            A = sc.nextInt();

            System.out.print("B 입력: ");
            B = sc.nextInt();

            if (A > 0 && B < 10) {
                break;
            }

            System.out.println("조건에 맞지 않습니다. 다시 입력하세요.");
        }

        System.out.println(A + B);

        sc.close();
    }
}