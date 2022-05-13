package com.company;
//Реализовать метод, который принимает 2 параметра int start и int finish и возвращает
// сумму всех чисел от start до finish включительно.
//Например: sum(10,15) -> 75
public class Main {

    public static void main(String[] args) {
        int start=2147483640; //с такими числами может выйти за пределы памяти int
        int finish=2147483641;
        start=10;
        finish=15;
        sumAllNumbers(start,finish);
        System.out.println(sumAllNumbers(start,finish));

    }
    public static long sumAllNumbers(int start, int finish) {
        long sum=0;
        for (long i = start; i <= finish; i++) {
            sum=sum+i; //sum+=i;
            }
        return sum;

        }

    }


