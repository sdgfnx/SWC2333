import javax.swing.JOptionPane;

public class FlowerShop {
    public static void main(String[] args) {
        // Create an array of FlowerArr named with size [10]
        Flower[] flowerArr = new Flower[10];

        // Prompt user to enter data and set the Flower object with the data entered, then store the object into array
        for (int i = 0; i < flowerArr.length; i++) {
            JOptionPane.showMessageDialog(null, "Enter details for Flower #" + (i + 1) + ":");
            
            
            String name = JOptionPane.showInputDialog("Enter name:");
            String color = JOptionPane.showInputDialog("Enter color for Flower:");
            double price = Double.parseDouble(JOptionPane.showInputDialog("Price: $"));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));


            // Create Flower object and store in the array
            flowerArr[i] = new Flower(name, color, price, quantity);
        }

        // Display all flower details
        StringBuilder allFlowerDetails = new StringBuilder("Flower Inventory:\n");
        for (Flower flower : flowerArr) {
            allFlowerDetails.append(flower).append("\n");
        }
        JOptionPane.showMessageDialog(null, allFlowerDetails.toString());
        
        // Calculate and display the total values of the flower inventory
        double totalValue = 0;
        for (Flower flower : flowerArr) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        JOptionPane.showMessageDialog(null, "Total Inventory Value: $" + totalValue);

        // Prompt the user to search for a flower by name and display its details
        String searchName = JOptionPane.showInputDialog("Enter the name of the flower to search:");
        boolean found = false;
        for (Flower flower : flowerArr) {
            if (flower.getName().equalsIgnoreCase(searchName)) {
                JOptionPane.showMessageDialog(null, "Found: " + flower);
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Flower not found in the inventory.");
        }

        // Implement a method to restock a specific flower in the inventory
        String restockName = JOptionPane.showInputDialog("Enter the name of the flower to restock:");
        for (Flower flower : flowerArr) {
            if (flower.getName().equalsIgnoreCase(restockName)) {
                int restockQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity to restock:"));
                flower.setQuantity(flower.getQuantity() + restockQuantity);
                JOptionPane.showMessageDialog(null, "Restocked successfully. Updated details: " + flower);
                break;
            }
        }
    }
}