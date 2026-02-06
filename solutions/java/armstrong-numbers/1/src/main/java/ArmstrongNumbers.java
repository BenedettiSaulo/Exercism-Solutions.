class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numToCheckString = Integer.toString(numberToCheck);

        int qtd = numToCheckString.length();

        int sum = 0;

        for (char c : numToCheckString.toCharArray()) {
            int digit = Character.getNumericValue(c);

            sum += Math.pow(digit, qtd);
        }

        return sum == numberToCheck;
    }

}
