import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square > 0 && square < 65) {
            return BigInteger.valueOf(2).pow(square - 1);
        }

        throw new IllegalArgumentException("square must be between 1 and 64");
    }

    BigInteger grainsOnBoard() {
        BigInteger totalGrains = BigInteger.ZERO;
        
        for (int square = 1; square <= 64; square++) {
            totalGrains = totalGrains.add(grainsOnSquare(square));
        }
        
        return totalGrains;
    }
}
