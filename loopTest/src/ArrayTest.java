public class ArrayTest {
    static void main(String[] args) {
        // 배열 변수 선언하기, 배열 이름을 복수형
        int[] scores = {75, 80, 50, 35};
        //3번쨰 값 출력 : 50
        System.out.println("3번쨰 배열 내용 : " + scores[2]);
        //2번째 배열의 값을 0으로 변경 후에 출력
        scores[1] = 0;
        System.out.println("2번쨰 배열 내용 : " + scores[1]);
        //전체 배열 내용 순회하면서 출력
        for (int i=0; i<scores.length; i++) {
            System.out.println(scores[i]);
        }
        String[] members = {"장원영", "안유진", "가을"};
        for (int i=0; i< members.length; i++) {
            if (i< members.length - 1) {
                System.out.println(members[i] + ",");
            }else {
                System.out.println(members[i]);
            }
        }
    }
}
