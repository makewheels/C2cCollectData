package mission.coin;

import util.Constants;
import util.WebUtil;

import java.sql.Timestamp;

public class CoinMission {
    public static void run(String sessionId) {
        String url = CoinUrl.BTC_PRICE;
        Coin coin = new Coin();
        coin.setJson(WebUtil.sendGet(url));
        coin.setUrl(url);
        coin.setPlatform("blockchain.info");
        coin.setProvider(Constants.PROVIDER);
        coin.setSessionId(sessionId);
        coin.setTimestamp(new Timestamp(System.currentTimeMillis()));
        coin.setCoinName("btc");
        CoinDao.save(coin);
    }
}
