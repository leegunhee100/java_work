package testfile3;


public class EX_13 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 5, 3};

        System.out.print("초기   : ");
        printArray(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;

            // 가장 작은 값의 인덱스 찾기
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // 현재 위치와 최솟값 교체
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

            System.out.print((i + 1) + "단계 : ");
            printArray(nums);
        }
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
