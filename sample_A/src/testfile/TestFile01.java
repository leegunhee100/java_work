package testfile;

import java.util.Scanner;

    public class TestFile01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("첫번째 수 입력: ");
            int a = sc.nextInt();

            System.out.print("두번째 수 입력: ");
            int b = sc.nextInt();

            int max;
            if (a>b) {
                max = a;
            }else {
                max = b;
            }

            System.out.println("큰 수 : " + max);

            sc.close();
        }
    }


