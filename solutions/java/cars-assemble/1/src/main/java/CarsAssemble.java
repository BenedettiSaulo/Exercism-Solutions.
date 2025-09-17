public class CarsAssemble {
    private static final int MINIMUM_AMOUNT_OF_CARDS_PER_HOUR = 221;
    private static final double SEVENTY_SEVEN_PERCENT_ERROR_RATE = 0.23;
    private static final double EIGHTY_PERCENT_ERROR_RATE = 0.20;
    private static final double NINETY_PERCENT_ERROR_RATE = 0.10;
    
    public double productionRatePerHour(int speed) {
        double carsPerHour = (speed * MINIMUM_AMOUNT_OF_CARDS_PER_HOUR); 
        
        if (speed > 9) {
            return carsPerHour -= carsPerHour * 0.23;
        } else if (speed > 8) {
            return carsPerHour -= carsPerHour * 0.20;
        } else if (speed > 4) {
            return carsPerHour -= carsPerHour * 0.10;
        } else {
            return carsPerHour;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }
}
