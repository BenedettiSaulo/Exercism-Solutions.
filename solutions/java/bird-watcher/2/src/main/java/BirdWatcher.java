
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
        birdsPerDay[birdsPerDay.length - 1] ++;
    }

    public boolean hasDayWithoutBirds() {
        for(int birdsVisitedToday: birdsPerDay) {
            if (birdsVisitedToday == 0) {
                return true;
            }
        }
        
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int countForFirstDays = 0;
        int pivot = (numberOfDays <= birdsPerDay.length) ? numberOfDays : birdsPerDay.length;
        
        for (int cont = 0; cont < pivot; cont++) {
            countForFirstDays += birdsPerDay[cont];
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
