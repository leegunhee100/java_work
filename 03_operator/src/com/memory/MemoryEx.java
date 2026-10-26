package com.memory;

public class MemoryEx  {
    static int value = 50;
    int n2 = 100;
    void add(){
        int n1 = 1;
        System.out.println("add함수의 n1 : " + n1);
        //System.out.println("밖에 있는 n2 : " + n2);
        int money = 0;
        if (true){
            int i = 10;
            System.out.println("i = " + i);
            money = money + 10000;
        }

        if (true){
            int i = 10;
            System.out.println("i = " + i);
            money = money + 10000;
        }
        System.out.println(money);
    }
    static void main(String[] args) {
        System.out.println("value = " + MemoryEx.value);
        //com.memory.MemoryEx.add();

        MemoryEx ex = new MemoryEx();
        System.out.println(ex.n2);
        ex.add();
    }
}