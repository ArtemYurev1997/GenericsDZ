package by.pvt.generics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage<Car, Motorcycle> garage = new Garage<Car, Motorcycle>(new Car(scanner.nextLine()), new Motorcycle(scanner.nextLine()));
        Garage<Car, Motorcycle> garage1 = new Garage<Car, Motorcycle>(new Car(scanner.nextLine()), new Motorcycle(scanner.nextLine()));
        System.out.println(garage);
        System.out.println(garage1);
    }
}
