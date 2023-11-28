package Sorting_Algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {2,9,1,3,8};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        for (int i = 0; i < size-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        System.out.print("After sorting");
        System.out.println();

        for (int num: nums) {
            System.out.print(num + " ");
        }
    }
}
