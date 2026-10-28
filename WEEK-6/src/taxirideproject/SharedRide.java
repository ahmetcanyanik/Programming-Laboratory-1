
package taxirideproject;

public class SharedRide extends EconomyRide {
    private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin, double pricePerMinute, int passengerCount) {
        super(passengerName, pickup, destination, distanceKm, pricePerKm, durationMin, pricePerMinute);
        this.passengerCount = passengerCount;

        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("WARNING!!! Passenger count is out of the range! Setted to 1!");
            this.passengerCount = 1;
        }
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare() / passengerCount) * 1.1;
    }

    @Override
    public String toString() {
        return "(SHARED RIDE) \n" + super.toString() + "\n Passenger Count: " + passengerCount + "\n ================================";
    }    
}
