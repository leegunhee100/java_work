package constant;
// 패키지는 클래스의 위치를 나타내는 정보이다.
public class ConstEx {
    public static final String GRUP_NAME ="IVE";
    static void main(String[] args) {
        final int MAX_MEMBER =6; //아이브의 맴버 수

        String name = "장원영";
        name = "안유진";
        System.out.println("아이브 맴버 수 : " + MAX_MEMBER);
        System.out.println("그룹 이름 : " + ConstEx.GRUP_NAME);
    }
}
