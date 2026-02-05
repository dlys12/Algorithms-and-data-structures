public class Main {

    static class BubbleSort {
        public static void bubbleSort(int[] A) {
            int n = A.length;
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    if (A[j] > A[j + 1]) {
                        int temp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 3, 8, 2};
        BubbleSort.bubbleSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
