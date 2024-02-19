/**
 * Program description:To define the instance variables (attributes) and instance methods (behaviours)
 *                      of a class named Flower
 * Programmer:Najihah Husna
 * Date:19 February 2024
 */
public class Flower
{
 // Attributes
    private String name;
    private String color;
    private double price;
    private int quantity;
    
 // Constructors
    public Flower() {
        // Default constructor
    }

    public Flower(String name, String color, double price, int quantity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    // Retrievers (accessors / getters) for each data member
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Mutators (setters) that sets all data members
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // toString() method that displays all information about the magazine object
    @Override
    public String toString() {
        return "Flower [Name: " + name + ", Color: " + color + ", Price: $" + price + ", Quantity: " + quantity + "]";
    }
}
