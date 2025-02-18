//subclass of car

class ElectricCar extends Car{
    private double maxSpeed;
    private double currentCharge;

    class ElectricCar(double maxSpeed, double currentCharge){
        this.maxSpeed = maxSpeed;
        this.currentCharge = currentCharge;
    }

    @Override
    public String toString(){
        //
    }

}
