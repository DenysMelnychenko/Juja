package ua.com.juja.core;

/**
 * Created by DM on 20.11.2015.
 */
public class EggsBread {

   public static String printPurchases(boolean hasEggs, boolean hasBread) {
            String a;
        if (hasEggs == true && hasBread == true) {
            return a = "bread,eggs";
        }
        else if (hasEggs == false && hasBread == true) {
           return a = "bread";
        }
        else if (hasEggs == true && hasBread == false) {
          return a = "eggs";
        }
      return a = "";
    }
}


