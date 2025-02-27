package org.example; //DO NOT DELETE
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //YOUR CODE GOES HERE
Scanner input= new Scanner(System.in);
double gallon;
double quarts;
double pints;
double cups;
double tables;
System.out.print(" Enter the number of gallons: ");
gallon = input.nextInt();
input.close();
quarts= gallon*4;
pints= quarts*2;
cups= pints*2;
tables= cups*16;
System.out.println("In "+ (gallon)+ " gallons there are:");
System.out.println((quarts)+ " quarts");
System.out.println((pints)+" pints");
System.out.println((cups)+" cups");
System.out.println((tables)+ " tablespoons");




    }
}
