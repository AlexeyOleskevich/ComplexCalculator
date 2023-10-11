package model.operation;

import model.Operation;
import model.complexnumber.ComplexNumber;

public class ProductOperation extends Operation {
    public ProductOperation() {
        super(Character.valueOf('*'));
    }

    public ComplexNumber product (ComplexNumber firstOperand, ComplexNumber secondOperand) {
        double prodReal = firstOperand.getReal() * secondOperand.getReal() -
                firstOperand.getImaginary()*secondOperand.getImaginary();
        double prodImaginary = firstOperand.getReal()*secondOperand.getImaginary() +
                firstOperand.getImaginary()*secondOperand.getReal();
        return new ComplexNumber(prodReal, prodImaginary);
    }
}
