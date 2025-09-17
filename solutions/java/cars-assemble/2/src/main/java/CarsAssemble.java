public class CarsAssemble {
    private static final int MINIMUM_AMOUNT_OF_CARDS_PER_HOUR = 221;
    private static final double SEVENTY_SEVEN_PERCENT_SUCCESS_RATE = 0.77;
    private static final double EIGHTY_PERCENT_SUCCESS_RATE = 0.80;
    private static final double NINETY_PERCENT_SUCCESS_RATE = 0.90;
    
    public double productionRatePerHour(int speed) {
        double carsPerHour = (speed * MINIMUM_AMOUNT_OF_CARDS_PER_HOUR); 
        
        if (speed > 9) {
            return carsPerHour * SEVENTY_SEVEN_PERCENT_SUCCESS_RATE;
        } else if (speed > 8) {
            return carsPerHour * EIGHTY_PERCENT_SUCCESS_RATE;
        } else if (speed > 4) {
            return carsPerHour * NINETY_PERCENT_SUCCESS_RATE;
        } else {
            return carsPerHour;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) this.productionRatePerHour(speed) / 60;
    }
}
