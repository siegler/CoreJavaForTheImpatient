package Ch2;

import java.util.ArrayList;
/*
Fully implement the Invoice class in Section 2.6.1, “Static Nested Classes,” on p. 79.
Provide a method that prints the invoice and a demo program that constructs and prints a sample invoice.
 */
/*
Ex15 == Inventory class
 */
public class Ex15 {
    private static class Item {
        String description;
        int quantity;
        double unitPrice;

        double price() {
            return quantity * unitPrice;
        }
    }

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("************Inventory***********\n");
        for (Item item: items) {
            sb.append(String.format("%s, %d, $%.2f, $%.2f\n",item.description, item.quantity, item.unitPrice, item.price()));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ex15 ex = new Ex15();
        ex.addItem("Blackwell Toaster", 2, 19.95);
        ex.addItem("Kindle Fire", 1, 59.95);
        System.out.println(ex);
    }
}
