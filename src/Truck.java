public class Truck implements Vehicle{


    private String type;
    private int weeks;

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }
 public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        double weeklyRate = 500.0;
        return weeklyRate * weeks;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Rental Weeks: " + weeks);
    }
}
