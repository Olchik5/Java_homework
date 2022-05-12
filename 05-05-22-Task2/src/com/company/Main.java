package com.company;
//Реализовать метод boolean isDivisible(int number1, int number2) который
// возвращает true если number1 делится на number2 без остатка. Аналогично
// первой задаче реализовать метод печати результата.
public class Main {

    public static void main(String[] args) {
	int number1 =10;
    int number2=0;
    isDivisible(number1,number2);
    printCheckResultMessage(number1,number2,isDivisible(number1,number2));
    printCheckResultMessage2(number1,number2,isDivisible2(number1,number2));
    }
    public static boolean isDivisible(int number1, int number2) {
        boolean result;
        if (number2!=0 && number1%number2==0 ) {
            return result=true;
        } else {
            return result=false;
        }
    }
    public static void printCheckResultMessage(int number1, int number2, boolean result)
    {   if (result==true) {
        System.out.println(number1 + "/" +number2 +" делится без остатка");
    }
        if(result==false) {
            System.out.println(number1 + "/" +number2 +" делится c остатком");
        }

    }
//вариант от преподавателя
public static boolean isDivisible2(int number1, int number2) {
        return (number2!=0) && (number1%number2==0);
}
    public static void printCheckResultMessage2(int number1, int number2, boolean result) {
        System.out.println((result)?number1 +"делится на "+ number2: number1+ " не делится на "+number2);
    }
}




