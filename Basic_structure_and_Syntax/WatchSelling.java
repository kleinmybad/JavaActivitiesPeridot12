package Basic_structure_and_Syntax;

public class WatchSelling {
    public static void main(String[] args) {
        System.out.println("ACTIVITY #2");
        System.out.println("WATCH SELLING PROGRAM");

        String watchName = "Titan Smart Watch";
        System.out.println("Watch Name: " + watchName);

        byte rating = 5;
        System.out.println("Rating: " + rating + " stars");

        short stock = 120;
        System.out.println("Available Stock: " + stock);

        int price = 3000;
        System.out.println("Price: ₱" + price);

        long salesThisYear = 500000L;
        System.out.println("Total Sales This Year: " + salesThisYear);

        float discount = 10.5f;
        System.out.println("Discount: " + discount + "%");

        double finalPrice = 3000 - (3000 * 0.105);
        System.out.println("Final Price after discount: ₱" + finalPrice);

        boolean isAvailable = true;
        System.out.println("Available: " + isAvailable);

        char grade = 'A';
        System.out.println("Product Grade: " + grade);

        String offer;
        offer = "Buy 1 Take 1 Promo!";
        System.out.println("Special Offer: " + offer);

        var message = "Limited Time Offer!";
        System.out.println(message);
    }
}