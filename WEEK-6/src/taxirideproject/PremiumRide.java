
package taxirideproject;

public class PremiumRide extends Ride {
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination, double distanceKm, double pricePerKm, int durationMin, double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, pricePerKm, durationMin);
        this.comfortFee = comfortFee;
        this.surgeMultiplier = surgeMultiplier;

        if (surgeMultiplier < 1.0 || surgeMultiplier > 3.0) {
            System.out.println("WARNING!!! Multiplier must be between 1 and 3! Setted to 1.0!");
            this.surgeMultiplier = 1.0;
        }
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare() + comfortFee) * surgeMultiplier;
    }

    @Override
    public String toString() {
        return "---PREMIUM CLASS--- \n" + super.toString() + "\n Comfort Fee: " + comfortFee + "\n Multiplier: " + surgeMultiplier + "\n ================================";
    }   
}
