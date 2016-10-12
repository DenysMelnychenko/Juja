package ua.com.juja.core;

/**
 * Created by DM on 24.09.2016.
 */


class CoinChanger {

    public static int exchangeAmountOfCoinsBrutForce(int amount) {
        int[] coins ={1,2,5,10,25,50};
        return exchangeAmountOfCoinsBrutForce ( amount, coins, 0 );
    }

    public static int exchangeAmountOfCoinsBrutForce(int amount, int coins[], int checkFromIndex) {
        if (amount == 0)
            return 1;
        else if (amount < 0 || coins.length == 0)
            return 0;
        else {
            int withFirstCoin = exchangeAmountOfCoinsBrutForce ( amount - coins[checkFromIndex], coins, checkFromIndex );
            int withoutFirstCoin = exchangeAmountOfCoinsBrutForce ( amount, coins, checkFromIndex + 1 );
            return withFirstCoin + withoutFirstCoin;
        }
    }
}