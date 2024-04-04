public class RoboDog extends Dog {
    // Additional instance variable specific to RoboDog
    private int batteryLevel;

    // Constructor for RoboDog
    public RoboDog(String name, String breed, int age, boolean isMale, int batteryLevel) {
        // Call the constructor of the superclass (Dog)
        super(name, breed, age, isMale);
        this.batteryLevel = batteryLevel;
    }

    // Method to charge the battery of the RoboDog
    public void chargeBattery(int amount) {
        batteryLevel += amount;
        System.out.println("Battery level charged by " + amount + " units. Current battery level: " + batteryLevel);
    }

    // Method to make the RoboDog bark
    @Override
    public void bark() {
        if (batteryLevel > 0) {
            super.bark(); // Call the bark method of the superclass (Dog)
            batteryLevel--; // Decrease battery level after barking
        } else {
            System.out.println("Battery level too low to bark. Please charge the battery.");
        }
    }

    // Method to display information about the RoboDog
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo method of the superclass (Dog)
        System.out.println("Battery Level: " + batteryLevel);
    }
}
