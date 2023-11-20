package Searching_Algorithms;

class BinarySearch {
    static int binarySearch(int a[], int b) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (a[mid] == b) {
                return mid;
            } else if (a[mid] < b) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] a = {3, 5, 7, 9, 11};
        int b = 9;

        int index = binarySearch(a, b);

        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Target element is at index " + index);
        }
    }
}