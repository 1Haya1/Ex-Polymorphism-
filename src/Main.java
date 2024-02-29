import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();

        while (true) {
            System.out.println("\nVehicle Rental System");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = scanner.next();
                    System.out.print("Enter Rental Days: ");
                    int carDays = scanner.nextInt();
                    Car car = new Car(carModel, carDays);
                    rentedVehicles.add(car);
                    System.out.println("Rental Details:");
                    car.displayDetails();
                    System.out.println("Rental Cost: $" + car.calculateRentalCost());
                    break;

                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = scanner.next();
                    System.out.print("Enter Rental Hours: ");
                    int bikeHours = scanner.nextInt();
                    Bike bike = new Bike(bikeBrand, bikeHours);
                    rentedVehicles.add(bike);
                    System.out.println("Rental Details:");
                    bike.displayDetails();
                    System.out.println("Rental Cost: $" + bike.calculateRentalCost());
                    break;

                case 3:
                    System.out.print("Enter Truck Type: ");
                    String truckType = scanner.next();
                    System.out.print("Enter Rental Weeks: ");
                    int truckWeeks = scanner.nextInt();
                    Truck truck = new Truck(truckType, truckWeeks);
                    rentedVehicles.add(truck);
                    System.out.println("Rental Details:");
                    truck.displayDetails();
                    System.out.println("Rental Cost: $" + truck.calculateRentalCost());
                    break;

                case 4:
                    System.out.println("\nRented Vehicles:");
                    for (Vehicle vehicle : rentedVehicles) {
                        vehicle.displayDetails();
                        System.out.println("Rental Cost: $" + vehicle.calculateRentalCost());
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }



    }
}