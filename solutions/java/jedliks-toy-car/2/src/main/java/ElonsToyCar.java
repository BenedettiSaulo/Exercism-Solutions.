public class ElonsToyCar {

    private int distanceTraveled = 0;
    private int battery = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        
        return String.format("Driven %d meters", this.distanceTraveled);
    }

    public String batteryDisplay() {

        return this.battery == 0 ? "Battery empty" : String.format("Battery at %d%%", this.battery);
    }

    public void drive() {

        if (this.battery != 0) {

            this.distanceTraveled += 20;
            this.battery--;    
        }
    }
}
