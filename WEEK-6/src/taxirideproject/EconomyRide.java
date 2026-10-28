
package taxirideproject;

public class EconomyRide extends Ride {
    private double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin, double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, pricePerKm, durationMin);
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public double calculateFare() {
        double result = super.calculateFare() + (getDurationMin() * pricePerMinute);
        if (result < 50) {
            result = 50;
        }
        return result;
    }

    @Override
    public String toString() {
        return "---ECONOMY CLASS--- \n" + super.toString() + "\n Price per minute: " + pricePerMinute + "\n ================================";
    }  
}
