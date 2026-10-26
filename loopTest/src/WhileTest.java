public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum = sum+ i;
            i++;
        }

        System.out.println("홀수의 합: " + sum);

        int j=1;
        sum = 0;
        do {
            sum = sum + j;
            j=j+1;
        } while (j<=10);
        System.out.println(sum);
    }
}