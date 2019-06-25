package mission.okex;

import util.Constants;
import util.WebUtil;

import java.sql.Timestamp;

public class OkexMission {
    public static void run(String sessionId) {
        String url = OkexUrls.getUsdtSell();
        Okex okex = new Okex();
        okex.setPlatform("okex");
        okex.setProvider(Constants.PROVIDER);

        okex.setCoinName("usdt");
        okex.setType("sell");
        okex.setJson(WebUtil.sendGet(url));
        okex.setSessionId(sessionId);
        okex.setTimestamp(new Timestamp(System.currentTimeMillis()));
        okex.setUrl(url);
        OkexDao.save(okex);

        url = OkexUrls.getUsdtBuy();
        okex.setCoinName("usdt");
        okex.setType("buy");
        okex.setJson(WebUtil.sendGet(url));
        okex.setSessionId(sessionId);
        okex.setTimestamp(new Timestamp(System.currentTimeMillis()));
        okex.setUrl(url);
        OkexDao.save(okex);

        url = OkexUrls.getBtcSell();
        okex.setCoinName("btc");
        okex.setType("sell");
        okex.setJson(WebUtil.sendGet(url));
        okex.setSessionId(sessionId);
        okex.setTimestamp(new Timestamp(System.currentTimeMillis()));
        okex.setUrl(url);
        OkexDao.save(okex);

        url = OkexUrls.getUsdtBuy();
        okex.setCoinName("btc");
        okex.setType("buy");
        okex.setJson(WebUtil.sendGet(url));
        okex.setSessionId(sessionId);
        okex.setTimestamp(new Timestamp(System.currentTimeMillis()));
        okex.setUrl(url);
        OkexDao.save(okex);
    }
}
