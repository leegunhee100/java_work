public class BasicForTest {
    static void main(String[] args) {
        // 1부터 10까지 더하기
        int sum = 0;
        for (int i=0; i<=10; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
        // 2. 1~20 사이의 짝수만 더하기
        for (int i=2; i<=20; i=i+2) {
            sum = sum + i;
        }
        System.out.println("결과 : " + sum);
    }
}
