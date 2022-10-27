public class Task {

    public static void main(String[] args) {
        int[] arr = {2, 5, 18, 50};
        int number = 40;
        multiplicationOfTwoNumbers(arr, number);

    }

    public static boolean multiplicationOfTwoNumbers(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr.length; j++)
                if (arr[i] * arr[j] == number) {
                    System.out.println("True");
                    return true;
                }
        System.out.println("False");
        return false;

    }
}

//    First level: Дан отсортированный массив целых чисел  и число. Написать метод, который возвращает
//    true, если  в массиве есть 2 числа, произведение которых равно заданному числу.
//        Пример:
//        {2, 5, 18, 50}, 36 -> true
//        {2, 5, 18, 50}, 40 -> false