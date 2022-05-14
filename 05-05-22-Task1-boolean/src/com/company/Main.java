package com.company;

//Реализовать метод boolean isEven(int number) который возвращает true если
// переданное число четное иначе возвращает false. Реализовать метод
// void printCheckResultMessage(int number, boolean result) который выводит на экран строку
// вида «10 это четное число» или «15 это не четное число»
//Подсказка: Используем конструкцию if и оператор % modulo
public class Main {

    public static void main(String[] args) {
        int number =11;
        isEven(number);
        printCheckResultMessage(number,isEven(number));

        printCheckResultMessage2(number, isEven2(number));
    }
    public static boolean isEven(int number) {
        boolean result;
        if (number%2==0) {
            return result=true;
        } else {
            return result=false;
        }
    }
    public static void printCheckResultMessage(int number, boolean result)
    {   if (result==true) {
        System.out.println(number + " это четное число");
    }
        if(result==false) {
        System.out.println(number + " это не четное число");
    }

    }
    public static boolean isEven2(int number) {
        return number%2==0;
    }
    public static void printCheckResultMessage2(int number, boolean result){
        /*if (result==true) {
            System.out.println(number + " это четное число");
        } else {
            System.out.println(number + " это не четное число");
        }

         */
        System.out.println((result)?number+ " это четное число":number + " это не четное число");
    }
}
