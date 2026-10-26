package com.basic;

public class BasicOperator {
    static void main(String[] args) {
        //1. 산술 연산자 +,-,*,/,%
        // % 나머지를 구하는 연산자
        int a = 10;
        int b = 4;
        int addAB = a + b;
        System.out.println("a+b = " + addAB);
        double devideAB = (double) a / b;
        System.out.println("a/b = " + devideAB);
        int modeAB = a % b;
        //A를 B로 나눈 나머지(정수)
        System.out.println("a%b = " + modeAB);
        // 2. 관계연산자 : 관계연산의 결과는 할상 논리값(true, false)이다.
        //>,<.>=,<=,!=
        // 관계연산은 주로 if 구문 안에서 사용된다.
        boolean result = a > b;
        System.out.println("a>b : " + result);

        result = a != b;
        System.out.println("a != b : " + result);

        //3. 논리 연산자(논리값과 논리값의 연산
        // and : &&, or : || : , not : !
        boolean boolA = true;
        boolean boolB = false;
        boolean boolResult;
        boolResult = boolA || boolB;
        System.out.println("결과 : " + boolResult);

        //4. 대입 연산자
        int x = 10;
        System.out.println("x=" + x);
        //x에 1을 더하기
        x = x + 1;
        System.out.println("x=" + x);
        // X에 1더하기
        x += 1; // x = x+1;
        System.out.println("x = " + x);
        //x 에서 특정 값(3)을 빼기
        x = x - 3; // x -= 3;
        System.out.println("x = " + x);
        x++;
        System.out.println("x = " + x);

        //5. 삼할연산자
        // 조건식? 참 : 거짓;
        // 점수(score)가 60점 이상이면 "합격", 그렇지 않으면 "불합격"
        int score = 59;
        //정식버전
        if (score >= 60) {
            //참인 문장
            System.out.println("합격");
        } else {
            //거짓인 문장
            System.out.println("불합격");
        }

        //삼항연산 사용
        System.out.println(score >= 60? "합격" : "불합격");
    }
}
