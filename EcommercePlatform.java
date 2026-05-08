import java.util.*;

interface ITaxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {

    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements ITaxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax = 18%";
    }
}

class Clothing extends Product implements ITaxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax = 5%";
    }
}

class Groceries extends Product implements ITaxable {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.12;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.02;
    }

    @Override
    public String getTaxDetails() {
        return "Groceries Tax = 2%";
    }
}

public class EcommercePlatform {

    public static void printFinalPrice(Product p) {

        double tax = 0;

        if (p instanceof ITaxable) {
            ITaxable t = (ITaxable) p;
            tax = t.calculateTax();

            System.out.println("\nTax Details: " + t.getTaxDetails());
            System.out.println("Tax Amount: " + tax);
        }

        double discount = p.calculateDiscount();

        double finalPrice = p.getPrice() + tax - discount;

        System.out.println("\nProduct ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getName());
        System.out.println("Original Price: " + p.getPrice());
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);

        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Electronics Details:");
        System.out.print("Product ID: ");
        int eId = sc.nextInt();
        sc.nextLine();

        System.out.print("Product Name: ");
        String eName = sc.nextLine();

        System.out.print("Price: ");
        double ePrice = sc.nextDouble();

        Product p1 = new Electronics(eId, eName, ePrice);

        System.out.println("\nEnter Clothing Details:");
        System.out.print("Product ID: ");
        int cId = sc.nextInt();
        sc.nextLine();

        System.out.print("Product Name: ");
        String cName = sc.nextLine();

        System.out.print("Price: ");
        double cPrice = sc.nextDouble();

        Product p2 = new Clothing(cId, cName, cPrice);

        System.out.println("\nEnter Grocery Details:");
        System.out.print("Product ID: ");
        int gId = sc.nextInt();
        sc.nextLine();

        System.out.print("Product Name: ");
        String gName = sc.nextLine();

        System.out.print("Price: ");
        double gPrice = sc.nextDouble();

        Product p3 = new Groceries(gId, gName, gPrice);

        ArrayList<Product> products = new ArrayList<>();

        products.add(p1);
        products.add(p2);
        products.add(p3);

        System.out.println("\n===== PRODUCT BILL DETAILS =====");

        for (Product p : products) {
            printFinalPrice(p);
        }

        sc.close();
    }
}