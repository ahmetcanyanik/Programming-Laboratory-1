
package busstopproject;

import java.util.ArrayList;
import java.util.Scanner;

public class BusStopProject {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> stopNames = new ArrayList<>();
        ArrayList<Integer> boardingList = new ArrayList<>();
        ArrayList<Integer> alightingList = new ArrayList<>();
        ArrayList<Integer> occupancyList = new ArrayList<>();

        System.out.print("How many stops are there on the route?: ");
        int durakSayisi = scanner.nextInt();

        System.out.print("What is the bus's seating capacity?: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        int currentPassengers = 0; 

        System.out.println("==========================================");

        for (int i = 0; i < durakSayisi; i++) {
            System.out.print("Enter stop name for Stop " + (i + 1) + ": ");
            String stopName = scanner.nextLine();
            stopNames.add(stopName);

            System.out.print("Enter passengers boarding: ");
            int boarding = scanner.nextInt();
            boardingList.add(boarding);

            int alighting;
            while (true) {
                System.out.print("Enter passengers alighting: ");
                alighting = scanner.nextInt();
                
                if (alighting <= currentPassengers + boarding) {
                    alightingList.add(alighting);
                    currentPassengers = currentPassengers + boarding - alighting;
                    break;
                } else {
                    System.out.println("WARNING: Alighting passengers can't be bigger than current passengers!!!");
                }
            }
            scanner.nextLine();

            occupancyList.add(currentPassengers);
            System.out.println("Current passengers on the bus after this stop: " + currentPassengers);
            System.out.println("------------------------------------------");
        }

        int overCapacityCount = 0;
        int maxBoarding = -1;
        String busiestStop = "";
        double totalOccupancy = 0;

        System.out.println("\n--- Display All Stops ---");
        
        for (int i = 0; i < durakSayisi; i++) {
            String name = stopNames.get(i);
            int b = boardingList.get(i);
            int a = alightingList.get(i);
            int occ = occupancyList.get(i);

            System.out.println("Stop name: " + name + ", Boarding: " + b + ", Alighting: " + a + ", Occupancy: " + occ);

            if (occ > capacity) {
                System.out.println("  -> Warning: Bus is over capacity at [" + name + "]!");
                overCapacityCount++;
            }

            totalOccupancy += occ;

            if (b > maxBoarding) {
                maxBoarding = b;
                busiestStop = name;
            }
        }

        System.out.println("\n==========================================");
        System.out.println("--- Statistics ---");

        System.out.println("The busiest stop: [" + busiestStop + "] with " + maxBoarding + " passengers boarding.");

        double averageOccupancy = totalOccupancy / durakSayisi;
        System.out.println("Average occupancy of the bus: " + averageOccupancy);

        System.out.println("Number of stops the bus exceeded capacity: " + overCapacityCount);

        int finalOccupancy = occupancyList.get(durakSayisi - 1);
        if (finalOccupancy != 0) {
            System.out.println("Warning: " + finalOccupancy + " passengers still on the bus after the final stop - please check your data.");
        }
        
        System.out.println("==========================================");
        
        scanner.close();
    }
}    
    

