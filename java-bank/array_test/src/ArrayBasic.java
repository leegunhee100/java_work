public class ArrayBasic {
    static void main(String[] args) {
        //배열을 선언
        // 1. 정수형 배열
        //배열 변수를 선언함과 동시에 초기화 하는 방법
        int[] scores = {85, 92, 78, 95, 88, 90};
        // 배열의 크기만 정하고 초기화 하기
        int[] values = new int[6];
        // 2. 문자열 배열
        String[] members = {"홍길동", "이순신", "김유신"};
        //공간만 미리 만들기
        String[] team = new String[5];
        // 모든 객체의 초기값 : null 값을 갖는다.
        // 팀의 1번째 있는 요소를 출력
        System.out.println("team 첫번째 : " + team[0]);
        if (team[0] == null) {
            System.out.println("같다.");
        }else {
            System.out.println("같지않다.");
        }
        // 3. 실수형 배열

        double[] data   = {0.2, 1.3, 3.1};
        System.out.println(data[1]);

        // members 배열의 길이들 출력
        System.out.println("member배열의 길이 : " + members.length);
    }
}
