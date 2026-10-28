
package taxirideproject;

import java.util.ArrayList;

public class TaxiRideProject {

    public static void main(String[] args) {
        ArrayList<Ride> display = new ArrayList<>();

        Ride r1 = new Ride("AHMET", "TRABZON", "KAYSERİ", 150, 2, 180);
        Ride r2 = new EconomyRide("VELİ", "İSTANBUL", "SAMSUN", 180, 3, 60, 1.2);
        Ride r3 = new PremiumRide("ALİ", "NİĞDE", "MUĞLA", 500, 1.3, 300, 50, 1.2);
        Ride r4 = new SharedRide("MEHMET", "ANKARA", "KIRIKKALE", 20, 50, 20, 1.1, 3);

        display.add(r1);
        display.add(r2);
        display.add(r3);
        display.add(r4);

        for (Ride ride : display) {
            System.out.println(ride.toString());
            System.out.println("--------------------------------------------------");
        }
    }
}
    
