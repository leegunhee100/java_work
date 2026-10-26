package testfile;

import java.util.Scanner;

public class TestFile03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        int score = sc.nextInt();
        String result;

        if (score>=90) {
            result = "A";
        } else if (score>=80) {
            result = "B";
        } else if (score>=70) {
            result = "C";
        } else if (score>=60) {
            result = "D";
        }else {
            result = "F";
        }
        System.out.println("성적 : " + result);

        int value = score / 10;
        switch (value) {
            case 10 :
                result = "A";
                break;
            case 9 :
                result = "A";
                break;
            case 8 :
                result = "B";
                break;
            case 7 :
                result = "C";
                break;
            case 6 :
                result = "D";
                break;
            default:
                result = "F";
        }
        System.out.println("switch로 구한 등급 : " + result);

        switch (value) {
            case 10 -> {result="A";}
            case 9 -> {result="A";}
            case 8 -> {result="B";}
            case 7 -> {result="C";}
            case 6 -> {result="D";}
            default -> {result="F";}
        }

        System.out.println("등급2 : " + result);
    }
}
