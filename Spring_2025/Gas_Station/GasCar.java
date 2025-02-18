//subclass of Car

class GasCar extends Car implements GasEngine{
    private double tankCapacity;
    private double currentVolume;


    public GasCar(double tankCapacity, double currentVolume){
        this.tankCapacity = tankCapacity;
        this.currentVolume = currentVolume;
    }

    @Override
    public String toString(){
        return "Car: " + getId() + " | Current Fuel: " + currentVolume + "/" + tankCapacity + " gals";
    }
}