package com.company;
//Реализовать метод, который в качестве параметров получает 3 числа типа инт.
// Метод должен возвращать true если и первое и второе число делятся без
// остатка на третье. Подсказка: Используйте метод, написанный в пункте 2

public class Main {

    public static void main(String[] args) {
	 int number1= 15;
     int number2=10;
     int number3=0;
     isDivisible(number1,number2,number3);
     printCheckResultMessage(number1,number2,number3,isDivisible(number1,number2,number3));
        printCheckResultMessage2(number1,number2,number3,isDivisible(number1,number2,number3));
    }
    public static boolean isDivisible(int number1, int number2,int number3) {
        boolean result;
        if ( (number3!=0) && (number1%number3==0) && (number2%number3==0)) {
            return result=true;
        } else {
            return result=false;
        }

    }
    public static void printCheckResultMessage(int number1, int number2, int number3, boolean result)
    {   if (result==true) {
        System.out.println(number1 +" и "+number2 +" делятся на " +number3 + "  без остатка");
    }
        if(result==false) {
            System.out.println(number1 +" и "+number2 +" не делятся на " +number3 );
        }

    }

    // вариант от преподавателя

    public static boolean isDivisible2(int number1, int number2) {
        return (number2!=0) && (number1%number2==0);
    }

    public static boolean isDivisible2(int number1, int number2,int number3) {
      return isDivisible2(number1,number3)&& isDivisible2(number2,number3);
    }
    public static void printCheckResultMessage2(int number1, int number2, int number3, boolean result){
        String str= number1+" и  " + number2;
        System.out.println((result)? str + " делятся на "+number3: "что-то не делится");
    }
}
