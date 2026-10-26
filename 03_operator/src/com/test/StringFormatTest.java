package com.test;

public class StringFormatTest {
    static void main(String[] args) {
        //클래스는 기능을 갖고 있는 아이다.
        String name = "이건희";
        int age = 26;
        int nameLength = name.length();
        System.out.println("이름 길이 : " + nameLength);
        String lowerCase = name.toLowerCase();
        System.out.println("이름 소문자 : " + lowerCase);
        String schoolName = "휴먼IT";
        String song = "학교종일땡떙떙" + schoolName + "어서모이자";
        System.out.println(song);
        // x=x+1;
        // \n 개행문자 \t 탭
        song = song + "\n 선생님이 우리를 기다리신다";
        song = song + "\n\t노래 끝";
        System.out.println(song);

        String textBlock = """
                동해물과 백두산이 마르고 닳도록
                하나님이 보우하사
                우리나라 만세
                """;
        System.out.println(textBlock);
        String memberInfo = """
                이름 : %s
                나이 : %d세
                """.formatted(name, age);
        System.out.println(memberInfo);
    }
}
