
package taxirideproject;

public class Ride {
    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private double pricePerKm;
    private int durationMin;

    public Ride(String passengerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;
        this.distanceKm = distanceKm;
        this.pricePerKm = pricePerKm;
        this.durationMin = durationMin;

        if (pricePerKm <= 0) {
            System.out.println("WARNING!!! Price per KM must be positive! Setted to 1!");
            this.pricePerKm = 1;
        }
        if (distanceKm <= 0) {
            System.out.println("WARNING!!! Distance KM must be positive! Setted to 1!");
            this.distanceKm = 1;
        }
        if (durationMin <= 0) {
            System.out.println("WARNING!!! Duration minute must be positive! Setted to 1!");
            this.durationMin = 1;
        }
    }

    public String getPassengerName() { return passengerName; }
    public String getPickup() { return pickup; }
    public String getDestination() { return destination; }
    public double getDistanceKm() { return distanceKm; }
    public double getPricePerKm() { return pricePerKm; }
    public int getDurationMin() { return durationMin; }

    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    @Override
    public String toString() {
        return "Name: " + passengerName + " From: " + pickup + " To: " + destination + 
               " Distance: " + distanceKm + " Duration: " + durationMin + 
               " Price per KM: " + pricePerKm + "\n TOTAL PRICE: " + calculateFare();
    }
}
