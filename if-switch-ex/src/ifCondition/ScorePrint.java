package ifCondition;

import java.util.Scanner;

public class ScorePrint {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적입력(0~100)");
        int score = sc.nextInt();
        String result;
        if (score>= 90) {
            result="수";
        } else if (score>=80) {
            result="우";
        } else if (score>=70) {
            result="미";
        } else if (score>=60) {
            result="양";
        } else {
            result="가";
        }
        System.out.println(result);
    }
}
