package Ch4;

/*
Suppose that in Section 4.2.2, “The equals Method,” on p. 140, the Item.equals method uses an instanceof test. Implement DiscountedItem.equals so that it compares only the superclass if otherObject is an Item, but also includes the discount if it is a DiscountedItem. Show that this method preserves symmetry but fails to be transitive—that is, find a combination of items and discounted items so that x.equals(y) and y.equals(z), but not x.equals(z).
 */

import java.util.Objects;

class Item {
    private String description;
    private double price;
    Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (!(other instanceof Item)) return false;
//        if (getClass() != other.getClass()) return false;
        Item otherObject = (Item) other;
        return Objects.equals(description, otherObject.description) && price == otherObject.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }
}

class DiscountedItem extends Item {
    private double discount;
    DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        if (!(other instanceof DiscountedItem)) return true;
        DiscountedItem otherObject = (DiscountedItem) other;
        return discount == otherObject.discount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}

public class Ex6 {
    public static void main(String[] args) {
        Item y = new Item("Cereal", 4);
        DiscountedItem x = new DiscountedItem("Cereal", 4, .25);
        //preserves symmetry
        System.out.println(y.equals(x));
        System.out.println(x.equals(y));

        DiscountedItem z = new DiscountedItem("Cereal", 4, .35);
        //but fails to be transitive
        System.out.println("Transitive?");
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
    }
}
