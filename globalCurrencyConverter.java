import java.util.Scanner;

// Utility class - no object creation needed
class ConverterEngine {

    // Static methods returning exchange rates (to INR)
    public static double getUSDRate() {
        return 83.0;
    }

    public static double getEURRate() {
        return 90.0;
    }

    public static double getGBPRate() {
        return 105.0;
    }

    // Static convert method - called directly using class name
    public static double convert(double amount, String currencyType) {

        switch (currencyType) {
            case "USD":
                return amount * getUSDRate();
            case "EUR":
                return amount * getEURRate();
            case "GBP":
                return amount * getGBPRate();
            default:
                System.out.println("Error: Invalid currency type entered.");
                return 0;
        }
    }
}

// Main class
public class GlobalCurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Global Currency Converter");
        System.out.println("Supported Currencies: USD, EUR, GBP");
        System.out.println("=====================================");

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Currency (USD / EUR / GBP): ");
        String currency = sc.next();

        double result = ConverterEngine.convert(amount, currency);  // Called without object

        if (result != 0) {
            System.out.println("Converted Amount in INR: " + result);
        }

        sc.close();
    }
}
