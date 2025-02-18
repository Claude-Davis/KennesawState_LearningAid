
public interface ElectricEngine {

    double rechargeBattery(double recharge){
        if (recharge <= maxBattery)    {battery = recharge;}
        if (recharge > maxBattery)     {battery = maxBattery;}
    }

    //getter (maxBattery)
    double getMaxBattery()     {return maxBattery;}  //returns max. capacity in kW

    //getter (currentCharge)
    double getCurrentCharge()  {return currentCharge;}   //returns current charge in kW
}
