package mission.huobi;

import util.Constants;
import util.WebUtil;

import java.sql.Timestamp;

public class HuobiMission {
    public static void run(String sessionId) {
        String url = HuobiUrls.USDT_SELL;
        Huobi huobi = new Huobi();
        huobi.setProvider("huobi");
        huobi.setProvider(Constants.PROVIDER);

        huobi.setCoinName("usdt");
        huobi.setType("sell");
        huobi.setJson(WebUtil.sendGet(url));
        huobi.setSessionId(sessionId);
        huobi.setTimestamp(new Timestamp(System.currentTimeMillis()));
        huobi.setUrl(url);
        HuobiDao.save(huobi);

        url = HuobiUrls.USDT_BUY;
        huobi.setCoinName("usdt");
        huobi.setType("buy");
        huobi.setJson(WebUtil.sendGet(url));
        huobi.setSessionId(sessionId);
        huobi.setTimestamp(new Timestamp(System.currentTimeMillis()));
        huobi.setUrl(url);
        HuobiDao.save(huobi);

        url = HuobiUrls.BTC_SELL;
        huobi.setCoinName("btc");
        huobi.setType("sell");
        huobi.setJson(WebUtil.sendGet(url));
        huobi.setSessionId(sessionId);
        huobi.setTimestamp(new Timestamp(System.currentTimeMillis()));
        huobi.setUrl(url);
        HuobiDao.save(huobi);

        url = HuobiUrls.BTC_BUY;
        huobi.setCoinName("btc");
        huobi.setType("buy");
        huobi.setJson(WebUtil.sendGet(url));
        huobi.setSessionId(sessionId);
        huobi.setTimestamp(new Timestamp(System.currentTimeMillis()));
        huobi.setUrl(url);
        HuobiDao.save(huobi);
    }
}
