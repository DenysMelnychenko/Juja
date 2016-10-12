package ua.com.juja.core;

/**
 * Created by DM on 22.09.2016.
 */

public class ExchangeMoney {
    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {

        return amountForExchange == 0 ? 0 : exchange ( amountForExchange, 0 );
    }

    private static int exchange(int amountForExchange, int indexCoin) {

        int[] coins = {1, 2, 5, 10, 25, 50};
        int sum = 0;

        if (amountForExchange == 0) {
            return 1;
        } else {
            while (indexCoin < coins.length && amountForExchange >= coins[indexCoin]) {

                return exchange ( amountForExchange - coins[indexCoin], indexCoin ) + exchange ( amountForExchange, indexCoin + 1 );

            }

        }

        return sum;
    }
}