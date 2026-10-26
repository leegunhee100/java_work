package testfile3;


public class EX_15 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 4, 2};

        System.out.print("초기   : ");
        printArray(nums);

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

            // key보다 큰 값을 오른쪽으로 이동
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // key를 알맞은 위치에 삽입
            nums[j + 1] = key;

            System.out.print((i) + "라운드: ");
            printArray(nums);
        }

        System.out.println("정렬 완료!");
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

