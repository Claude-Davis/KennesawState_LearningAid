package Gas_Station;


public interface GasEngine {
    double refuelTank(double refuel){
        if (refuel <= tankCapacity)   {tank = refuel;}
        if (refuel > tankCapacity)    {tank = tankCapacity}
    }
    double getTankCapacity()   {return tankCapacity}  //returns max. amount of fuel in gallons
    double getCurrentVolume()  {return currentVolume} //returns current amount of fuel in gallons
}
