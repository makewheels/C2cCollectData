package mission.okex;

public class OkexUrls {
    public static String getUsdtSell() {
        return "https://www.okex.com/v3/c2c/tradingOrders/book?t=" + System.currentTimeMillis() +
                "&side=sell&baseCurrency=usdt&quoteCurrency=cny&userType=certified&paymentMethod=all";
    }

    public static String getUsdtBuy() {
        return "https://www.okex.com/v3/c2c/tradingOrders/book?t=" + System.currentTimeMillis() +
                "&side=buy&baseCurrency=usdt&quoteCurrency=cny&userType=certified&paymentMethod=all";
    }

    public static String getBtcSell() {
        return "https://www.okex.com/v3/c2c/tradingOrders/book?t=" + System.currentTimeMillis() +
                "&side=sell&baseCurrency=btc&quoteCurrency=cny&userType=certified&paymentMethod=all";
    }

    public static String getBtcBuy() {
        return "https://www.okex.com/v3/c2c/tradingOrders/book?t=" + System.currentTimeMillis() +
                "&side=buy&baseCurrency=btc&quoteCurrency=cny&userType=certified&paymentMethod=all";
    }
}
