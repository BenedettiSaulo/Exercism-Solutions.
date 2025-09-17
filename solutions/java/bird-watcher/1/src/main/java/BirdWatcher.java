
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {

        boolean hasDayWithoutBirds = false;

        for(int birdsVisitedToday: birdsPerDay) {

            if (birdsVisitedToday == 0) {
                hasDayWithoutBirds = true;
            }
        }
        
        return hasDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {

        int countForFirstDays = 0;

        if (numberOfDays <= birdsPerDay.length) {
            
            for (int cont = 0; cont < numberOfDays; cont++) {
                countForFirstDays += birdsPerDay[cont];
            }
        } else {
            
            for (int cont = 0; cont < birdsPerDay.length; cont++) {
                countForFirstDays += birdsPerDay[cont];
            }
        }
        
        return countForFirstDays;
    }

    public int getBusyDays() {

        int busyDays = 0;

        for(int birdsVisitedToday: birdsPerDay) {

            if (birdsVisitedToday > 4) {
                busyDays++;
            }
        }
        
        return busyDays;
    }
}
