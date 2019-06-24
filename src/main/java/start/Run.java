package start;

import bean.Huobi;
import bean.HuobiDao;
import util.UuidUtil;
import util.WebUtil;

import java.sql.Timestamp;

public class Run {
    public static void main(String[] args) {
        String sessionId = UuidUtil.getUuid();
        Huobi huobi = new Huobi();
        huobi.setPlatform("huobi");
        huobi.setCoinName("usdt");
        huobi.setType("sell");
        huobi.setJson(WebUtil.sendGet(HuobiUrls.USDT_SELL));
        huobi.setSessionId(sessionId);
        huobi.setProvider("GoogleCloud-mysql");
        huobi.setTimestamp(new Timestamp(System.currentTimeMillis()));
        huobi.setUrl(HuobiUrls.USDT_SELL);
        HuobiDao.save(huobi);
    }
}
