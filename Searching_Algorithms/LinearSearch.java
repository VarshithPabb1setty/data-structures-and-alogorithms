package Searching_Algorithms;
class LinearSearch {
    static int linearSearch(int a[], int b) {
        int n = a.length - 1;

        for (int i = 0; i < n; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] a = {3, 5, 7, 9, 11};
        int b = 9;

        int index = linearSearch(a, b);

        if (index == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Target element is at index " + index);
        }
    }
}