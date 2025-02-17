//subclass of Car

class GasCar extends Car{
    //implement interface GasEngine
    private double tankCapacity;
    private double currentVolume;


    public GasCar(double tankCapacity, double currentVolume){
        this.tankCapacity = tankCapacity;
        this.currentVolume = currentVolume;
    }

    //getter (tank capacity)
    public double getTCapacity(){
        return tankCapacity;
    }

    //getter (current volume)
    public double getCVolume(){
        return currentVolume;
    }

    @Override
    public String toString(){
        return "Car: " + getId() + " | Current Fuel: " + currentVolume + "/" + tankCapacity + " gallons.";
    }
}