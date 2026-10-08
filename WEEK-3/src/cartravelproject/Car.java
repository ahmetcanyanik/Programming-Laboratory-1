
package cartravelproject;

public class Car {
String plateNumber;
    String model;
    
    double mileage;
    double fuelLevel;
    double tankCapacity;
    
    public Car(String plateNumber, String model, double mileage, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }
    
    public void drive(double km) {
        if ((fuelLevel - (km / 10)) >= 0) {
            mileage += km;
            fuelLevel -= (km / 10);
            System.out.println("Driving " + km + " KM");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("Not enough fuel for this trip!");
        }
    }
    
    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println(">>> Refuelling " + amount + " L fuel.");
        if (fuelLevel >= tankCapacity) {
            fuelLevel = tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        }
        System.out.println("----------------------------------------");
    }
    
    public void checkStatus() {
        System.out.println("Plate Number: " + plateNumber);
        System.out.println("Model: " + model);
        System.out.println("Current Mileage: " + mileage);
        System.out.println("Fuel Level: " + fuelLevel);
        System.out.println("Tank Capacity: " + tankCapacity);
        if (fuelLevel < (tankCapacity / 10)) {
            System.out.println("Low fuel warning!");
        }
    }
}
