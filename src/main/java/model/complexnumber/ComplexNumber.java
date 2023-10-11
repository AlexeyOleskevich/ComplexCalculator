package model.complexnumber;

import model.operation.AdditionOperation;
import model.operation.DivisionOperation;
import model.operation.ProductOperation;
import model.operation.SubtractionOperation;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber number) {
        return new AdditionOperation().add(this, number);
    }

    public ComplexNumber subtract(ComplexNumber number) {
        return new SubtractionOperation().subtract(this, number);
    }

    public ComplexNumber divide(ComplexNumber number) {
        return new DivisionOperation().divide(this, number);
    }

    public ComplexNumber product(ComplexNumber number) {
        return new ProductOperation().product(this,number);
    }

    @Override
    public String toString() {
        if (imaginary == 0 && real == 0) {
            return String.valueOf(0);
        }
        if (imaginary == 0) {
            return String.valueOf(real);
        }
        if (real == 0) {
            return String.valueOf(imaginary) + "i";
        }
        if (imaginary > 0) {
            return String.valueOf(real) + "+" + String.valueOf(imaginary) + "i";
        }
        return String.valueOf(real) + String.valueOf(imaginary) + "i";
    }






}
