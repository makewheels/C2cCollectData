package start;

import bean.Huobi;
import bean.HuobiDao;
import util.UuidUtil;
import util.WebUtil;

import java.sql.Timestamp;

public class Run {
    public static void main(String[] args) {
        String sessionId = UuidUtil.getUuid();

        String url = HuobiUrls.USDT_SELL;
        Huobi huobi = new Huobi();
        huobi.setPlatform("huobi");
        huobi.setCoinName("usdt");
        huobi.setType("sell");
        huobi.setJson(WebUtil.sendGet(url));
        huobi.setSessionId(sessionId);
        huobi.setProvider("GoogleCloud-mysql");
        huobi.setTimestamp(new Timestamp(System.currentTimeMillis()));
        huobi.setUrl(url);
        HuobiDao.save(huobi);

        url = HuobiUrls.USDT_BUY;
        huobi.setPlatform("huobi");
        huobi.setCoinName("usdt");
        huobi.setType("buy");
        huobi.setJson(WebUtil.sendGet(url));
        huobi.setSessionId(sessionId);
        huobi.setProvider("GoogleCloud-mysql");
        huobi.setTimestamp(new Timestamp(System.currentTimeMillis()));
        huobi.setUrl(url);
        HuobiDao.save(huobi);
    }
}
