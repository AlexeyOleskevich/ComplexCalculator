package model;

import model.complexnumber.ComplexNumber;

public abstract class Operation{
    private Character operation;

    public Operation(Character operation) {
        if (!OperationValidator.isValidOperation(operation)) {
            System.out.println("This operation is not supported.");
        }
        this.operation = operation;
    }

    public Character getOperation() {
        return operation;
    }

    public void setOperation(Character operation) {
        this.operation = operation;
    }

}
