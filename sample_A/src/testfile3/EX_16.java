package testfile3;


public class EX_16 {
    public static void main(String[] args) {
        int[] scores = {85, 50, 90, 75, 85, 60, 89, 98, 83, 65};

        for (int i = 0; i < scores.length; i++) {
            int rank = 1;

            for (int j = 0; j < scores.length; j++) {
                if (scores[j] > scores[i]) {
                    rank++;
                }
            }

            System.out.println("점수: " + scores[i] + "  순위: " + rank);
        }
    }
}
