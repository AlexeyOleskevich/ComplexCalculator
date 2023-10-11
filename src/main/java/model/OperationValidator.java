package model;

public class OperationValidator {
    public static boolean isValidOperation(Character operation) {
        return operation.equals('+') || operation.equals('-') || operation.equals('*') || operation.equals('/');
    }
}
