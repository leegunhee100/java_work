package testfile2;

public class Ex_04 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        int i = 10;

            do {
                if (i != 3) {
                    System.out.println(i);
                }
                    i--;
                } while (i >= 1);
    }
}

