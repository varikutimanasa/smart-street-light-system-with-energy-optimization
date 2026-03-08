import java.util.Scanner;
class SmartStreetLight {
      boolean isNight;
     boolean motionDetected;
 // Method to check light condition 
    void checkLightCondition() {
        if (!isNight)
        {
            System.out.println("Day time detected");
            System.out.println("Street Lights are OFF");
       }
 else
 {
            System.out.println("Night time detected ");
            controlLight();
  }
 }
    // Method to control street light based on motion
    void controlLight() {
        if (motionDetected) {
            System.out.println("Motion detected ");
            System.out.println("Street Light is ON (Full Brightness)");
        } else {
            System.out.println("No motion detected");
            System.out.println("Street Light is in DIM mode (Energy Saving)");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartStreetLight light = new SmartStreetLight();
        System.out.println("Enter time (day/night): ");
        String time = sc.next();
        System.out.println("Is motion detected? (yes/no): ");
        String motion = sc.next();
        // Setting values
        light.isNight = time.equalsIgnoreCase("night");
        light.motionDetected = motion.equalsIgnoreCase("yes");
        // Check system
        light.checkLightCondition();
        sc.close();
    }
}
