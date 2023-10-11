package view;

import model.complexnumber.ComplexNumber;

import java.util.Scanner;

public class UserView {

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input real part of first number: ");
        double firstReal = input.nextDouble();
        System.out.println("Input imaginary part of first number: ");
        double firstImaginary = input.nextDouble();

        ComplexNumber first = new ComplexNumber(firstReal, firstImaginary);

        System.out.println("Input real part of second number: ");
        double secondReal = input.nextDouble();
        System.out.println("Input imaginary part of second number: ");
        double secondImaginary = input.nextDouble();

        ComplexNumber second = new ComplexNumber(secondReal, secondImaginary);

        System.out.println("Input operation: ");

        while(true) {
            Command  command = Command.valueOf(input.next());
            switch (command) {
                case ADD: {
                    System.out.println(first.add(second));
                    break;
                } case SUBTRACT: {
                    System.out.println(first.subtract(second));
                    break;
                } case DIVIDE: {
                    System.out.println(first.divide(second));
                    break;
                } case PRODUCT: {
                    System.out.println(first.product(second));
                } case EXIT: {
                    break;
                }
            }
        }
    }
}
