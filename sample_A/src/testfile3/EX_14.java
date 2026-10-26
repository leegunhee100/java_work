package testfile3;


public class EX_14 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 4, 2};

        System.out.print("초기   : ");
        printArray(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

            System.out.print((i + 1) + "라운드: ");
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
