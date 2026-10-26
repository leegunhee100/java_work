package testfile3;


import java.util.Arrays;

public class EX_17 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;

            // 중복 검사
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        // 오름차순 정렬
        Arrays.sort(lotto);

        // 결과 출력
        System.out.print("🎱 로또 번호: ");
        for (int num : lotto) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
