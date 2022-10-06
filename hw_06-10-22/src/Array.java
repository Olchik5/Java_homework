public class Array {

    public static void main(String[] args) {

        int k = 2;
        int[] arr = { 2,4,5,6,3,2,5};
        int[] arr1 = {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != k) {
                for (int j = 0; j < arr1.length; j++) {

                }
                System.out.print(arr[i] + " ");

            }

        }
    }
}
//Second level: 1. Дан массив целых чисел и ещё одно целое число.
// Удалите все вхождения этого числа из массива (пропусков быть не должно).