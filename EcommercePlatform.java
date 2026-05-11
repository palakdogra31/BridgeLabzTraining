// import java.util.*;

// interface ITaxable {
//     double calculateTax();
//     String getTaxDetails();
// }
// abstract class Product {
//     private int productId;
//     private String name;
//     private double price;

//     public Product(int productId, String name, double price) {
//         this.productId = productId;
//         this.name = name;
//         this.price = price;
//     }
//     public int getProductId() {
//         return productId;
//     }

//     public String getName() {
//         return name;
//     }

//     public double getPrice() {
//         return price;
//     }
//     public void setProductId(int productId) {
//         this.productId = productId;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setPrice(double price) {
//         this.price = price;
//     }

//      public abstract double calculateDiscount();
// }

// class Electronics extends Product implements ITaxable {

//     public Electronics(int productId, String name, double price) {
//         super(productId, name, price);
//     }

//     @Override
//     public double calculateDiscount() {
//         return getPrice() * 0.10;
//     }

//     @Override
//     public double calculateTax() {
//         return getPrice() * 0.18;
//     }

//     @Override
//     public String getTaxDetails() {
//         return "Electronics Tax = 18%";
//     }
// }

// class Clothing extends Product implements ITaxable {

//     public Clothing(int productId, String name, double price) {
//         super(productId, name, price);
//     }

//     @Override
//     public double calculateDiscount() {
//         return getPrice() * 0.15;
//     }

//     @Override
//     public double calculateTax() {
//         return getPrice() * 0.05;
//     }

//     @Override
//     public String getTaxDetails() {
//         return "Clothing Tax = 5%";
//     }
// }

// class Groceries extends Product implements ITaxable {

//     public Groceries(int productId, String name, double price) {
//         super(productId, name, price);
//     }

//     @Override
//     public double calculateDiscount() {
//         return getPrice() * 0.12;
//     }

//     @Override
//     public double calculateTax() {
//         return getPrice() * 0.02;
//     }

//     @Override
//     public String getTaxDetails() {
//         return "Groceries Tax = 2%";
//     }
// }


//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

   
//         System.out.println("Enter Electronics Details:");
//         System.out.print("Product ID: ");
//         int eId = sc.nextInt();
//         sc.nextLine();

//         System.out.print("Product Name: ");
//         String eName = sc.nextLine();

//         System.out.print("Price: ");
//         double ePrice = sc.nextDouble();

//         Product p1 = new Electronics(eId, eName, ePrice);


//         System.out.println("\nEnter Clothing Details:");
//         System.out.print("Product ID: ");
//         int cId = sc.nextInt();
//         sc.nextLine();

//         System.out.print("Product Name: ");
//         String cName = sc.nextLine();

//         System.out.print("Price: ");
//         double cPrice = sc.nextDouble();

//         Product p2 = new Clothing(cId, cName, cPrice);


//         System.out.println("\nEnter Grocery Details:");
//         System.out.print("Product ID: ");
//         int gId = sc.nextInt();
//         sc.nextLine();

//         System.out.print("Product Name: ");
//         String gName = sc.nextLine();

//         System.out.print("Price: ");
//         double gPrice = sc.nextDouble();

//         Product p3 = new Groceries(gId, gName, gPrice);

//         sc.close();
//     }
// }




import java.util.*;

// Interface for taxable products
interface ITaxable {

    // Method to calculate tax
    double calculateTax();

    // Method to display tax details
    String getTaxDetails();
}

// Abstract class representing a general product
abstract class Product {

    // Encapsulated data members
    private int productId;
    private String name;
    private double price;

    // Constructor to initialize product details
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method for discount calculation
    public abstract double calculateDiscount();
}

// Electronics class inheriting Product and implementing ITaxable
class Electronics extends Product implements ITaxable {

    // Constructor
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Calculate 10% discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    // Calculate 18% tax
    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    // Return tax details
    @Override
    public String getTaxDetails() {
        return "Electronics Tax = 18%";
    }
}

// Clothing class inheriting Product and implementing ITaxable
class Clothing extends Product implements ITaxable {

    // Constructor
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Calculate 15% discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15;
    }

    // Calculate 5% tax
    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    // Return tax details
    @Override
    public String getTaxDetails() {
        return "Clothing Tax = 5%";
    }
}

// Groceries class inheriting Product and implementing ITaxable
class Groceries extends Product implements ITaxable {

    // Constructor
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Calculate 12% discount
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.12;
    }

    // Calculate 2% tax
    @Override
    public double calculateTax() {
        return getPrice() * 0.02;
    }

    // Return tax details
    @Override
    public String getTaxDetails() {
        return "Groceries Tax = 2%";
    }
}

// Main class
public class EcommercePlatform {

    // Method to print final bill details
    public static void printFinalPrice(Product p) {

        double tax = 0;

        // Checking whether product is taxable
        if (p instanceof ITaxable) {

            // Downcasting Product reference to ITaxable
            ITaxable t = (ITaxable) p;

            // Calculate tax
            tax = t.calculateTax();

            // Display tax details
            System.out.println("\nTax Details: " + t.getTaxDetails());
            System.out.println("Tax Amount: " + tax);
        }

        // Calculate discount
        double discount = p.calculateDiscount();

        // Calculate final price
        double finalPrice = p.getPrice() + tax - discount;

        // Display product details
        System.out.println("\nProduct ID: " + p.getProductId());
        System.out.println("Product Name: " + p.getName());
        System.out.println("Original Price: " + p.getPrice());
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);

        System.out.println("-----------------------------------");
    }

    // Main method
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking Electronics details
        System.out.println("Enter Electronics Details:");
        System.out.print("Product ID: ");
        int eId = sc.nextInt();
        sc.nextLine();

        System.out.print("Product Name: ");
        String eName = sc.nextLine();

        System.out.print("Price: ");
        double ePrice = sc.nextDouble();

        // Creating Electronics object
        Product p1 = new Electronics(eId, eName, ePrice);

        // Taking Clothing details
        System.out.println("\nEnter Clothing Details:");
        System.out.print("Product ID: ");
        int cId = sc.nextInt();
        sc.nextLine();

        System.out.print("Product Name: ");
        String cName = sc.nextLine();

        System.out.print("Price: ");
        double cPrice = sc.nextDouble();

        // Creating Clothing object
        Product p2 = new Clothing(cId, cName, cPrice);

        // Taking Grocery details
        System.out.println("\nEnter Grocery Details:");
        System.out.print("Product ID: ");
        int gId = sc.nextInt();
        sc.nextLine();

        System.out.print("Product Name: ");
        String gName = sc.nextLine();

        System.out.print("Price: ");
        double gPrice = sc.nextDouble();

        // Creating Grocery object
        Product p3 = new Groceries(gId, gName, gPrice);

        // Creating ArrayList to store products
        ArrayList<Product> products = new ArrayList<>();

        // Adding products to list
        products.add(p1);
        products.add(p2);
        products.add(p3);

        // Display heading
        System.out.println("\n===== PRODUCT BILL DETAILS =====");

        // Loop through all products and print bill
        for (Product p : products) {
            printFinalPrice(p);
        }

        // Closing scanner
        sc.close();
    }
}