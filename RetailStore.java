import java.util.ArrayList;
import java.util.Scanner;

class Product{
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

public class RetailStore {
    private ArrayList<Product> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct() {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        products.add(new Product(name, price, quantity));
        System.out.println("Product added successfully!");
    }

    public void editProduct() {
        System.out.print("Enter the name of the product to edit: ");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter new quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine();
                product.setPrice(price);
                product.setQuantity(quantity);
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void deleteProduct() {
        System.out.print("Enter the name of the product to delete: ");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                products.remove(product);
                System.out.println("Product deleted successfully!");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Available Products:");
            for (Product product : products) {
                product.displayDetails();
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n--- Retail Store Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    displayProducts();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        RetailStore store = new RetailStore();
        store.menu();
    }
}
