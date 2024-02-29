public class Bike implements Vehicle{


    private String brand;
    private int hours;

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }






    @Override
    public double calculateRentalCost() {
        double hourlyRate = 10.0;
        return hourlyRate * hours;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Rental Hours: " + hours);
    }
}
