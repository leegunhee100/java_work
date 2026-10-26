
package testfile;

import java.util.Scanner;

public class TestFile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수 입력: ");
        int a = sc.nextInt();

        System.out.print("두번째 수 입력: ");
        int b = sc.nextInt();

        System.out.println("처음 값 : a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("변경 후 : a = " + a + ", b = " + b);

        sc.close();
    }
}
