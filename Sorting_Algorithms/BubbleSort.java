package Sorting_Algorithms;

public class BubbleSort {
     public static void main(String[] args) {
        int nums[] = {4, 6, 8, 2, 15};
        int size = nums.length;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.print("After sorting");
        System.out.println();

        for (int num: nums) {
            System.out.print(num + " ");
        }
     }
}
