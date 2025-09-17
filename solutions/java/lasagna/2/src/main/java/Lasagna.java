public class Lasagna {

    private static final int LASAGNA_PREPARATION_TIME_IN_MINUTES = 40;
    private static final int LAYER_PREPARATION_TIME_IN_MINUTES = 2;
    
    public int expectedMinutesInOven() {
        return LASAGNA_PREPARATION_TIME_IN_MINUTES;
    }

    public int remainingMinutesInOven(int minutesSpentInOven) {
        return expectedMinutesInOven() - minutesSpentInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return LAYER_PREPARATION_TIME_IN_MINUTES * numberOfLayers;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}
