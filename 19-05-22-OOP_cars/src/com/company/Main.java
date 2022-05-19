package com.company;

public class Main {

    public static void main(String[] args) {
        Cars car1 = new Cars("Audi", 2020, "white");
        Cars car2 = new Cars("BMW", 2018, "blue");
        Cars car3 = new Cars("VW", 2021, "green");

        Cars [] carsArray = {car1,car2,car3};
        for (int i = 0; i < carsArray.length; i++) {
        carsArray[i].print();

        }
    }
}
