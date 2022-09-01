public class Item {
    String name;
    int price;
    float weight;
    int quantity;
    String description;
    boolean canbetraded;

    public void itemDialouge() {
        System.out.println("--Item Information--" + "\n" + "Name: " + name + "\n" + "Price: " + price + " pesos" + "\n" + "Weight: " + weight + " gram(s)" + "\n" + "Tradability: " + canbetraded + "\n" + "\n" + "Item Description: " + description + "\n" + "--------------" + "\n");
    }

    public Item(String itemName, int itemPrice, float itemWeight, int itemQuantity, String itemDescription, boolean itemCanbetraded) {
        name = itemName;
        price = itemPrice;
        weight = itemWeight;
        quantity = itemQuantity;
        description = itemDescription;
        canbetraded = itemCanbetraded;
    }
}
