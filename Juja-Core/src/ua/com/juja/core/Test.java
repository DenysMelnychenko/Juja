package ua.com.juja.core;

/**
 * Created by DM on 20.11.2015.
 */
public class Test {
    public static void main(String[] args) {
        String purchase = EggsBread.printPurchases(true, true);

        if (purchase == null)
            throw new AssertionError("Result cannot be null");

        String[] purchases = purchase.split(",");
        if (purchases.length != 2)
            throw new AssertionError("Expected 2 purchases, but was " + purchases.length);
        boolean hasEggs = false, hasBread = false;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i].trim().equalsIgnoreCase("eggs")) hasEggs = true;
            if (purchases[i].trim().equalsIgnoreCase("bread")) hasBread = true;
        }
        if (hasBread && hasEggs)
            System.out.print("OK");
    }
}
