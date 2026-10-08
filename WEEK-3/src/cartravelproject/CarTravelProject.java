
package cartravelproject;

public class CarTravelProject {

    public static void main(String[] args) {
        
Car car1 = new Car("61 TS 1967", "BMW", 0, 100, 100);
        car1.checkStatus();
        System.out.println("----------------------------------------");
        
        car1.drive(200);
        car1.checkStatus();
        System.out.println("----------------------------------------");
        
        car1.drive(900);
        System.out.println("----------------------------------------");
        
        car1.refuel(50);
        car1.checkStatus();
        System.out.println("----------------------------------------");
        
    }
}
    

