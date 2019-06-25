package mission.exchangerate;

import util.Constants;
import util.WebUtil;

import java.sql.Timestamp;

public class ExchangeRateMission {
    public static void run(String sessionId) {
        String url = ExchangeRateUrl.BASE_USD;
        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.setJson(WebUtil.sendGet(url));
        exchangeRate.setUrl(url);
        exchangeRate.setPlatform("exchangeratesapi.io");
        exchangeRate.setProvider(Constants.PROVIDER);
        exchangeRate.setSessionId(sessionId);
        exchangeRate.setTimestamp(new Timestamp(System.currentTimeMillis()));
        ExchangeRateDao.save(exchangeRate);
    }
}
