package model.operation;

import model.Operation;
import model.complexnumber.ComplexNumber;

public class DivisionOperation extends Operation {
    public DivisionOperation() {
        super(Character.valueOf('/'));
    }

    public ComplexNumber divide(ComplexNumber firstOperand, ComplexNumber secondOperand) {
        double divReal = (firstOperand.getReal() * secondOperand.getReal() +
                firstOperand.getImaginary() * secondOperand.getImaginary()) /
                (secondOperand.getReal() * secondOperand.getReal() +
                        secondOperand.getImaginary() * secondOperand.getImaginary());
        double divImaginary = (secondOperand.getReal() * firstOperand.getImaginary() -
                secondOperand.getImaginary() * firstOperand.getReal()) /
                (secondOperand.getReal() * secondOperand.getReal() +
                        secondOperand.getImaginary() * secondOperand.getImaginary());
        return new ComplexNumber(divReal, divImaginary);
    }
}
