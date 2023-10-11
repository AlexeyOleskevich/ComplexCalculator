package model.operation;

import model.Operation;
import model.complexnumber.ComplexNumber;

public class AdditionOperation extends Operation {

    public AdditionOperation() {
        super(Character.valueOf('+'));
    }

    public ComplexNumber add(ComplexNumber firstOperand, ComplexNumber secondOperand) {
        ComplexNumber sum = new ComplexNumber(firstOperand.getReal() + secondOperand.getReal(),
                firstOperand.getImaginary() + secondOperand.getImaginary());
        return sum;
    }
}
