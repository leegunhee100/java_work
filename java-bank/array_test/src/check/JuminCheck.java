package check;

import java.util.Arrays;
import java.util.Scanner;

public class JuminCheck {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호 입력(-제외) : ");

        String[] data = sc.next().split("");

        System.out.println(Arrays.toString(data));
        int[] juminNumber = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            juminNumber[i] = Integer.parseInt(data[i]);
        }
        System.out.println(Arrays.toString(juminNumber));

    }
}
