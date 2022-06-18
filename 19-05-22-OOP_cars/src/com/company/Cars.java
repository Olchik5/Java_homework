package com.company;

public class Cars {
 String model;
 int year;
 String colour;

 public Cars(String m, int y, String c){
  model=m;
  year=y;
  colour=c;

 }

 public void print(){
  System.out.println("Model is: " + model+ ", Year is: " + year + ", Colour: " + colour);
 }

}
