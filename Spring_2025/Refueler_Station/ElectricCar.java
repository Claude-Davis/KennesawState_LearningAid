package Gas_Station;

class ElectricCar extends Car implements ElectricEngine{
    private double maxBattery;
    private double currentCharge;

    public ElectricCar(double maxBattery, double currentCharge){
        this.maxBattery = maxBattery;
        this.currentCharge = currentCharge;
    }

    @Override
    public String toString(){
        return "Car: " + getId() + " | Current Charge: " + currentCharge + "/" + maxBattery + " kW";
    }

}
