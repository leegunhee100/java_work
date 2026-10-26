import java.lang.reflect.Array;
import java.util.Arrays;

public class AttaysEx {
    static void main(String[] args) {
        // scores 배열의 선언 : 85, 92, 78, 95, 88, 90
        // scores 배열의 값을하나씩 for 후프를 이룔해서 출력
        int[] scores = {85, 92, 78, 95, 88, 90};
        for (int x : scores) {
            System.out.println(x);
        }
        // scores 배열 전체 한방에 출력 하기
        System.out.println(scores.toString(scores));
        int max = Array.stream(scores).max().orElse();
        System.out.println("큰 값 : " +max);

        System.out.println("오름차군 정령 후 : " + Arrays.stream(scores));

        int[] capyScores = Arrays.copyOf(scores, scores.length);
        System.out.println(Arrays.toString(capyScores));
    }
}
