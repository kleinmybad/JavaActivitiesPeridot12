package Basic_structure_and_Syntax;

public class CarSelling {

    public static void main(String[] args) {

        String carBrand = "Toyota";
        String carModel = "Lambo";
        int year = 2026;
        float price = 95000.0f;
        boolean available = true;
        char owner = 'L';
        System.out.println("Owner: " + owner);
        System.out.println(" CAR SELLING");
        System.out.println("Brand: " + carBrand);
        System.out.println("Model: " + carModel);
        System.out.println("Year: " + year);
        System.out.println("Price: PHP " + price);
        System.out.println("Available: " + available);

        int quantity = 2;
        float totalPrice = price * quantity;

        System.out.println("\nCustomer Order");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: PHP " + totalPrice);
    }
}

