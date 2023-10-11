package model.operation;

import model.Operation;
import model.complexnumber.ComplexNumber;

public class SubtractionOperation extends Operation {
    public SubtractionOperation() {
        super(Character.valueOf('-'));
    }

    public ComplexNumber subtract(ComplexNumber first, ComplexNumber second) {
        ComplexNumber difference = new ComplexNumber(first.getReal() - second.getReal(),
                first.getImaginary() - second.getImaginary());
        return difference;
    }
}
