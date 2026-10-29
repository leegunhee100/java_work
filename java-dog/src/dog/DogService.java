package dog;

import dog.Dog;

public class DogService {

    private Dog[] dogs = new Dog[3];
    private int count = 0;

    // 강아지 등록
    public void insertDog(String name, int age, String breed) {

        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null && dogs[i].getName().equals(name)) {
                System.out.println("이미 등록된 강아지입니다.");
                return;
            }
        }

        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] == null) {
                dogs[i] = new Dog(name, age, breed);
                count++;
                System.out.println("강아지 등록 완료!");
                return;
            }
        }

        System.out.println("더 이상 등록할 수 없습니다.");
    }

    // 강아지 목록
    public void selectAll() {

        if (count == 0) {
            System.out.println("** 등록된 강아지가 없습니다. **");
            return;
        }

        System.out.println("===== 강아지 목록 =====");

        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null) {
                System.out.println(dogs[i]);
            }
        }
    }

    // 강아지 삭제
    public void deleteDog(String name) {

        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i] != null && dogs[i].getName().equals(name)) {
                dogs[i] = null;
                count--;
                System.out.println("강아지 삭제 완료!");
                return;
            }
        }

        System.out.println("삭제할 강아지를 찾을 수 없습니다.");
    }
}
