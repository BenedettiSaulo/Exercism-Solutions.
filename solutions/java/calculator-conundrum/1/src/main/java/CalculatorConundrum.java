class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        try {
            switch (operation) {
            case "+":
                int sum = operand1 + operand2;
                return String.format("%d %s %d = %d", operand1, operation, operand2, sum);
            case "*":
                int mult = operand1 * operand2;
                return String.format("%d %s %d = %d", operand1, operation, operand2, mult);
            case "/":
                double div = operand1 / operand2;
                return String.format("%d %s %d = %.0f", operand1, operation, operand2, div);
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            default:
                throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        
    }
}
