package testfile2;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("n을 입력하세요 : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }

        System.out.println("결과 : " + sum);


        sc.close();
    }
}