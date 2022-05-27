package com.company;
 /*Дан массив целых чисел. Реализовать метод, который возвращает минимальное
  значение в данном массиве.
         Например: {1,3,6,-1,4,-5,9} -> -5
         */
public class Main {

     public static void main(String[] args) {
         int[] array = {1, 3, 6, -1, 4, -5, 9};
         minIntegerInArray(array);
         printArray(array);

     }

     public static int minIntegerInArray(int[] array) {
         int min = array[0];
         for (int i = 1; i < array.length; i++) {

             //тернарным оператором
             min = (array[i] < min) ? array[i] : min;
            /*if (array[i]<min) {
                min=array[i];
            }

        }*/
         }
         System.out.println(min);
         return min;
     }

     public static void printArray(int[] array) {
         for (int i = 0; i < array.length; i++) {
             System.out.print("[" + i + "]:" + array[i] + "  ");



         }
     }

     //public static int minValue2(int[] array) {
       //  int min = array[0];
        // for (int i = 1; i < array.length; min = (array[i] < min) ? array[i] : min, i++) {
        //     return min;
         //}
    // }
}

