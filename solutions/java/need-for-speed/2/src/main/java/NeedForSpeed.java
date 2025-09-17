class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
		return this.speed;
	}

	public int getBattery() {
		return this.battery;
	}

	public int getBatteryDrain() {
		return this.batteryDrain;
	}

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {

        if (!this.batteryDrained()) {
            this.distanceDriven += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        int missingDistance = this.distance - car.distanceDriven();

		int batteryConsumer = (missingDistance * car.getBatteryDrain()) / car.getSpeed();

		return batteryConsumer <= car.getBattery();
    }
}
