package testfile3;


public class EX_12 {
    public static void main(String[] args) {
        int[] count = new int[13];

        // 주사위 2개를 36,000번 던지기
        for (int i = 0; i < 36000; i++) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;

            int sum = dice1 + dice2;

            count[sum]++;
        }

        // 합계별 등장 횟수와 비율 출력
        for (int i = 2; i <= 12; i++) {
            double ratio = (double) count[i] / 36000;

            System.out.printf("%-3d : %d (%.6f)%n",
                    i, count[i], ratio);
        }
    }
}
