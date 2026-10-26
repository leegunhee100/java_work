package testfile2;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int start = Math.min(A, B);
        int end = Math.max(A, B);
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println(sum);

        sc.close();
    }
}
