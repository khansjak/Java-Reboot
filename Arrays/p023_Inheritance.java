package Arrays;

public class p023_Inheritance {
    public static void main(String[] args) {
        gasVehicle gas = new gasVehicle();
        eclecticVehicle electric = new eclecticVehicle();

        gas.milesCounter = 100;
        gas.fuelConsumed = 20;
        System.out.println("Efficiency is :" + gas.getMileage());

        electric.milesCounter = 200;
        electric.powerConsumed = 56;
        System.out.println("Efficiency is :" + electric.getMileage());

        HybridVehicles hybridVehicles = new HybridVehicles();
        hybridVehicles.milesCounter = 100;
        hybridVehicles.powerConsumed = 10;
        hybridVehicles.fuelConsumed = 12;

        System.out.println("Hybrid Efficiency :" + hybridVehicles.getMileage());
    }
}

interface fuelEfficiency {
    int testInterface = 10;
    float getMileage();

}

interface BatteryMachines {
    void changeBattery();
}

class HybridVehicles implements hybridEfficiency,BatteryMachines {
    float milesCounter;
    float powerConsumed;
    float fuelConsumed;

    @Override
    public float getMileage() {
        return (float) ((0.5f * getFuelEfficiency()) + (0.5 * getChargeEfficiency()));
    }

    @Override
    public float getFuelEfficiency() {
        return fuelConsumed / milesCounter;
    }

    @Override
    public float getChargeEfficiency() {
        return powerConsumed / milesCounter;
    }

    @Override
    public void changeBattery() {
        System.out.println("Change the battery");
    }
}

interface hybridEfficiency extends fuelEfficiency,BatteryMachines
{
    float getFuelEfficiency();
    float getChargeEfficiency();
}


class gasVehicle implements hybridEfficiency {
    float milesCounter;
    float fuelConsumed;

    @Override
    public float getMileage() {
        return milesCounter / fuelConsumed;
    }

    @Override
    public void changeBattery() {

    }

    @Override
    public float getFuelEfficiency() {
        return 0;
    }

    @Override
    public float getChargeEfficiency() {
        return 0;
    }
}

class eclecticVehicle implements fuelEfficiency {
    float milesCounter;
    float powerConsumed;

    @Override
    public float getMileage() {
        return milesCounter / powerConsumed;
    }
}


