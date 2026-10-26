import chat.ChatRoom;
import constant.ConstEx;

public class Main {
    public static void main(String[] args) {
        System.out.println("그룹 이름 : " + ConstEx.GRUP_NAME);
        // 두명의 메모장 = 일반변수(지역변수)
        int chulsuMemo = 0;
        int gildongMemo = 0;
        // 길동의 메모값을 +1
        gildongMemo++;
        System.out.println("철수 메모값 : " + chulsuMemo);
        System.out.println("길동 메모값 : " + gildongMemo);

        //단톡방 인원 3명 들어옴
        ChatRoom.memberCount++;
        ChatRoom.memberCount = ChatRoom.memberCount + 1;
        ChatRoom.memberCount+=1;

        System.out.println(ChatRoom.ROOM_NAME + ", 인원 : " + ChatRoom.memberCount + "명");
    }
}
