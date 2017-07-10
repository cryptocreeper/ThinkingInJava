package chapter13_strings.task04;

import java.util.Formatter;

public class Receipt {
    private int itemColumnWidth = 20;
    private int qtyColumnWidth = 5;
    private int priceColumnWidth = 10;
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format("%-" + itemColumnWidth + "s %" + qtyColumnWidth + "s %" + priceColumnWidth + "s\n", "Item", "Qty", "Price");
        f.format("%-" + itemColumnWidth + "s %" + qtyColumnWidth + "s %" + priceColumnWidth + "s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-" + itemColumnWidth + "." + itemColumnWidth + "s %" + qtyColumnWidth + "d %" + priceColumnWidth + ".2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-" + itemColumnWidth + "s %" + qtyColumnWidth + "s %" + priceColumnWidth + ".2f\n", "Tax", "", total * 0.06);
        f.format("%-" + itemColumnWidth + "s %" + qtyColumnWidth + "s %" + priceColumnWidth + "s\n", "", "", "-----");
        f.format("%-" + itemColumnWidth + "s %" + qtyColumnWidth + "s %" + priceColumnWidth + ".2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's magic beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
