package animal;

public class AnimalMain {
    static void main(String[] args) {
        //강아지 - 푸들, 쫑이, 3세
        Dog jjong = new Dog();
        jjong.sp = "푸들";
        jjong.name = "쫑이";
        jjong.age = 3;
        jjong.sound();
        //고양이 - 자부종, 냥이, 2세
        Cat jjong1 = new Cat();
        jjong1.sp = "자부종";
        jjong1.name = "냥이";
        jjong1.age = 2;
        jjong1.sound();
    }
}
