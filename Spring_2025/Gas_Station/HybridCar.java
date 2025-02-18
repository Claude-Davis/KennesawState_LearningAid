
class HybridCar extends Car implements GasEngine implements ElectricEngine{
    private double maxBattery;
    private double currentCharge;
    private double tankCapacity;
    private double currentVolume;

    public HybridCar(double maxBattery, double currentCharge, double tankCapacity, double currentVolume){
        this.maxBattery = maxBattery;
        this.currentCharge = currentCharge;
        this.tankCapacity = tankCapacity;
        this.currentVolume = currentVolume;
    }

    @Override
    public String toString(){
        return "Car: " + getId() + " | Current Charge: " + CurrentCharge() + "/" + maxBattery + "kW | Current Fuel: " + currentVolume + "/" + tankCapacity + " gals";
    }
}